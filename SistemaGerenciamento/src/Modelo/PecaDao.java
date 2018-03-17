package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class PecaDao implements Dao<Peca>{
    
    private List<Peca> pecas;
    
    public PecaDao(){
        pecas = new ArrayList<>();
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
    
    @Override
    public boolean salvar(Peca obj) {
        return pecas.add(obj);
    }
    
    @Override
    public boolean remover(Peca id) {
        return pecas.remove(id);
    }

    @Override
    public Peca buscar(int id) {
    for(Peca e : pecas){
        if(e.getId()== id){
            return e;
        }
    }
    return null;
    }
    
    
}
