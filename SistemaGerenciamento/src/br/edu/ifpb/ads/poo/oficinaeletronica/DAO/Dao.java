package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

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
    public boolean salvar(T obj);
    
    /**
     * @param obj
     * @return retorna o true caso seja removido, caso contrario retorna false
     */
    public boolean remover(T obj);
    
    /**
     * @param id
     * @return retorna o true exista, caso contrario retorna false
     */
    public T buscar(int id);
    
}
