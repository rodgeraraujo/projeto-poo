/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Funcionario;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface IntDao {
    public boolean salvar(Funcionario obj) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(Funcionario obj) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException;
    
    public List<Funcionario> listar() throws IOException, ClassNotFoundException;
}
