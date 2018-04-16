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
 * @author Lucas
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
    
    public List<Cliente> listar() throws IOException, ClassNotFoundException;
}
