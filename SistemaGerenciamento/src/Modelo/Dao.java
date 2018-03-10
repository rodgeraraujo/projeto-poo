package Modelo;

/**
 *
 * @author Lucas
 */
public interface Dao <T> {
    
    public boolean salvar(T obj);
    public boolean remover(T obj);
    public T buscar(int id);
    
}
