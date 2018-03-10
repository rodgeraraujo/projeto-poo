package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class ServicoDao implements Dao<Servico>{
    
    private List<Servico> servicos;
    
    public ServicoDao(){
        servicos = new ArrayList<>();
    }
    
    @Override
    public boolean salvar(Servico obj) {
        return servicos.add(obj);
    }

    @Override
    public boolean remover(Servico obj) {
        return servicos.remove(obj);
    }

    @Override
    public Servico buscar(int id) {
    for(Servico e : servicos){
        if(e.getOrdemServico()== id){
            return e;
        }
    }
    return null;
    }
    
}
