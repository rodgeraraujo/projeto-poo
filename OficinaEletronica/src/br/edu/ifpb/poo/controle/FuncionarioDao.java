package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Funcionario;
import java.io.IOException;
import java.util.List;
/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
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
    
    /**
     * @return retorna lista de funcionários
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public List<Funcionario> listar() throws IOException, ClassNotFoundException;
}
