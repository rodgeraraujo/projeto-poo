package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @date 18/03/2018
 */
public class PecaDao implements Dao<Peca>{
    
    private List<Peca> pecas;
    
    public PecaDao(){
        pecas = new ArrayList<>();
    }
    
    /**
     * Esse metodo salva as informações sobre a peça
     * 
     * @param obj
     * @return armazena as informações da peça
     */
    @Override
    public boolean salvar(Peca obj) {
        return pecas.add(obj);
    }
    
    /**
     * Esse metodo remove as informações sobre da peça
     * 
     * @param id
     * @return remove a peça
     */
    @Override
    public boolean remover(Peca id) {
        return pecas.remove(id);
    }

    /**
     * Esse metodo busca as informações sobre a peça
     * 
     * @param id
     * @return retorna as informações da peça, e retorna <i>null</i> caso o 
     * valor não esteja armazenado
     */
    @Override
    public Peca buscar(int id) {
    for(Peca e : pecas){
        if(e.getId()== id){
            return e;
        }
    }
    return null;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.pecas);
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
        final PecaDao other = (PecaDao) obj;
        if (!Objects.equals(this.pecas, other.pecas)) {
            return false;
        }
        return true;
    }
}
