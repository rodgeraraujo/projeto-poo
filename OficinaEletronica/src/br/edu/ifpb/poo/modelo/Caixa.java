package br.edu.ifpb.poo.modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
import java.time.LocalDate;

public class Caixa {
   private float saldo;
   private LocalDate data;
   private Funcionario[] funcionario;

   /**
    * 
    * @param saldo saldo em caixa
    * @param data data referente ao saldo
    */
    public Caixa(float saldo, LocalDate data) {
        this.saldo = saldo;
        this.data = data;
    }

    /**
     * 
     * @return retorna o saldo 
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo 
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return retorna data 
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * 
     * @param data 
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Caixa{" + "saldo=" + saldo + ", data=" + data + '}';
    }
   
   
}
