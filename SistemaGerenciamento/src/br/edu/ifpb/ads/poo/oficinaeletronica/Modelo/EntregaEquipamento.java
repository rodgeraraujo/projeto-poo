package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * @version 1.0
 * @author Rogério Araújo <rogerio.araujo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 19/03/2018
 */
public class EntregaEquipamento {
    
    private final LocalDate data;
    private Cliente[] clientes;
    private Equipamento[] equipamentos;

    /**
     * 
     * @param data
     * @param clientes
     * @param equipamentos 
     */
    public EntregaEquipamento(LocalDate data, Cliente[] clientes, Equipamento[] equipamentos) {
        this.data = data;
        this.clientes = clientes;
        this.equipamentos = equipamentos;
    }
    
    /**
     * @return retorna o nome do cliente
     */
    public Cliente[] getClientes() {
        return clientes;
    }

    /**
     * @param clientes 
     */
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    /**
     * @return retorna o equipamento entregue pelo cliente
     */
    public Equipamento[] getEquipamentos() {
        return equipamentos;
    }

    /**
     * @param equipamentos 
     */
    public void setEquipamentos(Equipamento[] equipamentos) {
        this.equipamentos = equipamentos;
    }

    /**
     * @return retorna descrição da entrega
     */
    @Override
    public String toString() {
        return "EntregaEquipamento{" + "clientes=" + Arrays.toString(clientes)
               + ", equipamentos=" + Arrays.toString(equipamentos) + '}';
    }
    
}
