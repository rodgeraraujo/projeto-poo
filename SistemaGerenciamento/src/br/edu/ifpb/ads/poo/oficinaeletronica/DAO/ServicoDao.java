package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

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
    
    private List<Servico> servicos;
    
    public ServicoDao(){
        servicos = new ArrayList<>();
    }
    
    /**
     * Esse metodo salva as informações sobre o serviço
     * 
     * @param obj
     * @return armazena as informações do serviço
     */
    @Override
    public boolean salvar(Servico obj) {
        return servicos.add(obj);
    }

    /**
     * Esse metodo remove as informações sobre o serviço
     * 
     * @param id
     * @return remove o serviço
     */
    @Override
    public boolean remover(Servico id) {
        return servicos.remove(id);
    }

    /**
     * Esse metodo busca as informações sobre o serviço
     * 
     * @param id
     * @return retorna as informações so serviço, e retorna <i>null</i> caso o 
     * valor não esteja armazenado
     */
    @Override
    public Servico buscar(int id) {
    for(Servico e : servicos){
        if(e.getOrdemServico()== id){
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
}
