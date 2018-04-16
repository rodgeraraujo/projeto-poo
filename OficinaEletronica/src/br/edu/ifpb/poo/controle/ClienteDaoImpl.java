package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Cliente;
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
public class ClienteDaoImpl implements ClienteDao {
    
    private File file;
    
    /**
     * Criar arquivo clientes.bin
     * @throws IOException 
     */
    public ClienteDaoImpl() throws IOException{
        file = new File("arquivos\\clientes.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    /**
     * Método salvar
     * @param c
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean salvar(Cliente c) throws IOException, ClassNotFoundException {
        List<Cliente> clientes =  listar();
        
        if(buscar(c.getCpf()) == null){
            if(clientes.add(c)){
                atualizaArquivo(clientes);
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
     * @param c
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean remover(Cliente c) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();
        

            if(clientes.remove(c)){
                atualizaArquivo(clientes);
                return true;
            }else{
                return false;
            }
    }


    /**
     * Método buscar
     * @param cpf
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public Cliente buscar(String cpf) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();
        
        for(Cliente e : clientes){
            if(e.getCpf().equals(cpf)){
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
    public List<Cliente> listar() throws IOException, ClassNotFoundException {
        if(file.length()>0){
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            return (List<Cliente>) in.readObject();
        }else{
            return new ArrayList<>();
        }
    }

    /**
     * Método para atualizar Arquivo
     * @param clientes
     * @throws FileNotFoundException
     * @throws IOException 
     */
    private void atualizaArquivo(List<Cliente> clientes)
            throws FileNotFoundException, IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(clientes);
        }
    }    
    
}
