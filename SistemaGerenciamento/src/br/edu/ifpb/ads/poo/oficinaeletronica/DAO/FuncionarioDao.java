package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Funcionario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class FuncionarioDao implements Dao<Funcionario> {

    private List<Funcionario> funcionarios;
    
    public FuncionarioDao(){
        funcionarios = new ArrayList<>();
    }
    
    @Override
    public boolean salvar(Funcionario obj) {
        return funcionarios.add(obj);
    }

    @Override
    public boolean remover(Funcionario obj) {
        return funcionarios.remove(obj);
    }

    @Override
  public Funcionario buscar(int id) {
    for(Funcionario e : funcionarios){
        if(e.getId()== id){
            return e;
        }
    }
    return null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.funcionarios);
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
        final FuncionarioDao other = (FuncionarioDao) obj;
        if (!Objects.equals(this.funcionarios, other.funcionarios)) {
            return false;
        }
        return true;
    }

    @Override
    public List<Funcionario> listar() throws IOException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
