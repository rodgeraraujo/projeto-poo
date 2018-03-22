package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class ClienteDao implements Dao<Cliente> {

    private List<Cliente> clientes;

    public ClienteDao(){
         clientes = new ArrayList<>();
    }
    @Override
    public boolean salvar(Cliente obj) {
        return clientes.add(obj);
    }

    @Override
    public boolean remover(Cliente obj) {
        return clientes.remove(obj);
    }

    @Override
    public Cliente buscar(int id) {
        for(Cliente e : clientes){
            if(e.getId() == id){
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
    
}
