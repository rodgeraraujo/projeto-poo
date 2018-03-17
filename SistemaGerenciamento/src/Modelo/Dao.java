package Modelo;
/**
 * Classe que implementa um DAO (DATA ACESS OBJECT) por meio de uma <b>lista</b>. Essa
 * implementação permite a realização das operações CRUD(CREATE-READ-UPDATE-
 * DELETE).
 * 
 * @author Lucas
 * @since 1.0
 * @version 1.0
 * @see java.util.ArrayList
 */
public interface Dao <T> {
    
    public boolean salvar(T obj);
    public boolean remover(T obj);
    public T buscar(int id);
    
}
