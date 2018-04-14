package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Cliente;
import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Servico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class ClienteDao implements Dao<Cliente> {

    private File file;
    
    private List<Cliente> clientes;

    public ClienteDao() throws IOException{
        
        File file = new File("arquivos\\clientes.bin");
        
        if(!file.exists()){
            file.createNewFile(); 
        }
    }
    @Override
    public boolean salvar(Cliente obj) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();
        
        if(buscarCpf(obj.getCpf()) == null){
            if(clientes.add(obj)){
                atualizarArquivo(clientes);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public boolean remover(Cliente obj) throws IOException, ClassNotFoundException {
        List<Cliente> clientes = listar();
        
        if(clientes.remove(obj)){
            atualizarArquivo(clientes);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Cliente buscar(int id) throws IOException, ClassNotFoundException {
        
        List<Cliente> clientes = listar();
        
        for(Cliente e : clientes){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    
    
    
    
    public Cliente buscarCpf(String cpf) throws IOException, ClassNotFoundException{
        List<Cliente> clientes = listar();
        
        for(Cliente e : clientes){
            if(e.getCpf() == cpf){
                return e;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteDao other = (ClienteDao) obj;
        if (!Objects.equals(this.clientes, other.clientes)) {
            return false;
        }
        return true;
    }

    private void atualizarArquivo(List<Cliente> clientes) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))) {
            out.writeObject(clientes);
        }    
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
    
}
