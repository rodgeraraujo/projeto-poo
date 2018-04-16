/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.controle;


import br.edu.ifpb.poo.modelo.Cliente;
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
public interface ClienteDao {
    public boolean salvar(Cliente c) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(Cliente c) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public Cliente buscar(String cpf) throws IOException, ClassNotFoundException;
    
    /**
     * 
     * @return retorna a lista de clientes
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public List<Cliente> listar() throws IOException, ClassNotFoundException;
}
