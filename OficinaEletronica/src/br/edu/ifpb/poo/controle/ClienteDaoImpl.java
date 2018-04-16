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
 * @author Lucas
 */
public class ClienteDaoImpl implements ClienteDao {
    
    private File file;
    
    public ClienteDaoImpl() throws IOException{
        file = new File("arquivos\\clientes.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

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

    private void atualizaArquivo(List<Cliente> clientes)
            throws FileNotFoundException, IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(clientes);
        }
    }    
    
}
