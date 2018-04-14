package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Servico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Lucas Garrido <lucagf07@gmail.com>
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @date 18/03/2018
 */
public class ServicoDao implements Dao<Servico>{
    
    private File file;
    
    private List<Servico> servicos;
    
    public ServicoDao() throws IOException, ClassNotFoundException{

        
        File file = new File("arquivos\\servicos");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }
    
    /**
     * Esse metodo salva as informações sobre o serviço
     * 
     * @param obj
     * @return armazena as informações do serviço
     */
    @Override
    public boolean salvar(Servico obj) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        
        if(buscar(obj.getOrdemServico()) == null){
            if(servicos.add(obj)){
                atualizaArquivo(servicos);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }

    /**
     * Esse metodo remove as informações sobre o serviço
     * 
     * @param id
     * @return remove o serviço
     */
    @Override
    public boolean remover(Servico id) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        
        if(servicos.remove(id)){
            atualizaArquivo(servicos);
            return true;
        }else{
            return false;
        }
    }

    /**
     * Esse metodo busca as informações sobre o serviço
     * 
     * @param id
     * @return retorna as informações so serviço, e retorna <i>null</i> caso o 
     * valor não esteja armazenado
     */
    @Override
    public Servico buscar(int id) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        for(Servico e : servicos){
            if(e.getOrdemServico() == id){
                return e;
            }
        }
        return null;
        
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.servicos);
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
        final ServicoDao other = (ServicoDao) obj;
        if (!Objects.equals(this.servicos, other.servicos)) {
            return false;
        }
        return true;
    }

    @Override
    public List<Servico> listar() throws IOException, ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            
            return (List<Servico>) in.readObject();
        }else{
            return null;
        }
    }

    private void atualizaArquivo(List<Servico> servicos) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(servicos);
            
        }
    }
}
