package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import java.io.IOException;
import java.util.List;

/**
 * Classe que implementa um DAO (DATA ACESS OBJECT) por meio de uma 
 * <b>lista</b>. Essa implementação permite a realização das operações CRUD
 * (CREATE-READ-DELETE).
 * 
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @author Rogério Araújo <rogerio.araujo@mail.com>
 * @version 1.0
 * @since 1.0
 * @date 18/03/2018
 */
public interface Dao <T> {
    
    /**
     * @param obj
     * @return retorna o true caso seja salvo, caso contrario retorna false
     */
    public boolean salvar(T obj) throws IOException, ClassNotFoundException;
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(T obj) throws IOException, ClassNotFoundException;
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public T buscar(int id) throws IOException, ClassNotFoundException;
    
    public List<T> listar() throws IOException, ClassNotFoundException;
    
}
