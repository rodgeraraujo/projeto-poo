package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class UserDaoImpl implements UserDao {
    
    private File file;
    
    /**
     * Criar arquivo users.bin
     * @throws IOException 
     */
    public UserDaoImpl() throws IOException{
        file = new File("arquivos\\users.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    /**
     * Método salvar
     * @param u
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean salvar(User u) throws IOException, ClassNotFoundException {
        List<User> users =  listar();
        
        if(buscar(u.getUsername()) == null){
            if(users.add(u)){
                atualizaArquivo(users);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Método remover
     * @param u
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean remover(User u) throws IOException, ClassNotFoundException {
        List<User> users = listar();
        

            if(users.remove(u)){
                atualizaArquivo(users);
                return true;
            }else{
                return false;
            }
    }

    /**
     * Método buscar
     * @param username
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public User buscar(String username) throws IOException, ClassNotFoundException {
        List<User> users = listar();
        
        for(User e : users){
            if(e.getUsername().equals(username)){
                return e;
            }
        }
        return null;
    }

    /**
     * Método listar
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public List<User> listar() throws IOException, ClassNotFoundException {
        if(file.length()>0){
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            return (List<User>) in.readObject();
        }else{
            return new ArrayList<>();
        }
    }

    /**
     * Método para atualizar arquivo
     * @param users
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void atualizaArquivo(List<User> users)
            throws FileNotFoundException, IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(users);
        }
    }    

}
