/**
 *
 * @author RODGER
 */

package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

import java.time.LocalDate;
import java.util.Arrays;

public class EntregaEquipamento {
    
    private final LocalDate data;
    private Cliente[] clientes;
    private Equipamento[] equipamentos;

    public EntregaEquipamento(LocalDate data, Cliente[] clientes, Equipamento[] equipamentos) {
        this.data = data;
        this.clientes = clientes;
        this.equipamentos = equipamentos;
    }
    
    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Equipamento[] getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(Equipamento[] equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "EntregaEquipamento{" + "clientes=" + Arrays.toString(clientes)
               + ", equipamentos=" + Arrays.toString(equipamentos) + '}';
    }
    
}
