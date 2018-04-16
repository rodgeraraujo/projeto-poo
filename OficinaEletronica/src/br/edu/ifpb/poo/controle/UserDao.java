/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.controle;

import br.edu.ifpb.edu.modelo.User;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface UserDao {
    public boolean salvar(User u) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(User u) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public User buscar(String username) throws IOException, ClassNotFoundException;
    
    public List<User> listar() throws IOException, ClassNotFoundException;
}
