package br.edu.ifpb.ads.poo.oficinaeletronica.DAO;

import br.edu.ifpb.ads.poo.oficinaeletronica.Modelo.Equipamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class EquipamentoDao implements Dao<Equipamento> {

    private List<Equipamento> equipamentos;
    
    public EquipamentoDao(){
        equipamentos = new ArrayList<>();
    }

    @Override
    public boolean salvar(Equipamento obj) {
        return equipamentos.add(obj);
    }

    @Override
    public boolean remover(Equipamento obj) {
        return equipamentos.remove(obj);
    }

    public Equipamento buscarEquip(String numSerie) {
        for(Equipamento e : equipamentos){
            if(e.getNumSerie().equals(numSerie)){
                return e;
            }
        }
        return null;
    }

    @Override
    public Equipamento buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
