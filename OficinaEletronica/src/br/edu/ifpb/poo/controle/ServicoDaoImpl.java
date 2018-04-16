/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.poo.controle;

import br.edu.ifpb.poo.modelo.Servico;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */

public class ServicoDaoImpl implements ServicoDao {
    private File file;

    /**
     * Criar arquivo servicos.bin
     * @throws IOException 
     */
    public ServicoDaoImpl() throws IOException{
        file = new File("arquivos\\servicos.bin");
        
        if(!file.exists()){
            file.createNewFile();
        }
    }

    /**
     * Método salvar
     * @param s
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean salvar(Servico s) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        
        if(buscar(s.getOrdemServico()) == null){
            if(servicos.add(s)){
                atualizaArquivo(servicos);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    /**
     * Método remover
     * @param s
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public boolean remover(Servico s) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        
            if(servicos.remove(s)){
                atualizaArquivo(servicos);
                return true;
            }else{
                return false;
            }
    }

    /**
     * Método buscar
     * @param ordemServico
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public Servico buscar(int ordemServico) throws IOException, ClassNotFoundException {
        List<Servico> servicos = listar();
        
        for(Servico e : servicos){
            if(e.getOrdemServico() == ordemServico){
                return e;
            }
        }
        return null;
    }

    /**
     * Método listar
     * @return
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    @Override
    public List<Servico> listar() throws IOException, ClassNotFoundException {
        if(file.length()>0){
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(file));
            return (List<Servico>) in.readObject();
        }else{
            return new ArrayList<>();
        }
    }

    /**
     * Método para atualizar arquivo
     * @param servicos
     * @throws IOException 
     */
    private void atualizaArquivo(List<Servico> servicos) throws IOException {
        try(ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file))){
            out.writeObject(servicos);
        }
    }
}
