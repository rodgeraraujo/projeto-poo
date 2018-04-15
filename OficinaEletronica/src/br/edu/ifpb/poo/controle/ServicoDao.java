/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.controle;

import br.edu.ifpb.edu.modelo.Servico;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lucas
 */
public interface ServicoDao {
    public boolean salvar(Servico s) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(Servico s) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public Servico buscar(int ordemServico) throws IOException, ClassNotFoundException;
    
    public List<Servico> listar() throws IOException, ClassNotFoundException;
}
