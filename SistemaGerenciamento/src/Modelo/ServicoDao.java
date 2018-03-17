package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class ServicoDao implements Dao<Servico>{
    
    private List<Servico> servicos;
    
    public ServicoDao(){
        servicos = new ArrayList<>();
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
    public boolean salvar(Servico obj) {
        return servicos.add(obj);
    }

    
    

//    @Override
//    public boolean remover(Servico obj) {
//    for(Servico e : servicos){
//        if(e.getOrdemServico()== obj.getOrdemServico()){
//            return servicos.remove(obj);
//            }
//        }
//        return false;
//    }
    
    @Override
    public boolean remover(Servico id) {
        return servicos.remove(id);
    }

    @Override
    public Servico buscar(int id) {
    for(Servico e : servicos){
        if(e.getOrdemServico()== id){
            return e;
        }
    }
    return null;
    }
    
    
}
