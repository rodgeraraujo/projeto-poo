/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Servico;
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
    
    /**
     * @return retorna lista de serviços
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public List<Servico> listar() throws IOException, ClassNotFoundException;
}
