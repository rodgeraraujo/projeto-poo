package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Funcionario;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface FuncionarioDao {
    public boolean salvar(Funcionario f) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(Funcionario f) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException;
    
    public List<Funcionario> listar() throws IOException, ClassNotFoundException;
}
