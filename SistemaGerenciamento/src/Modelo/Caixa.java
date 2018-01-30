/**
 *
 * @author Lucas
 */
package Modelo;

import java.time.LocalDate;

public class Caixa {
   private float saldo;
   private LocalDate data;
   private Funcionario[] funcionario;

    public Caixa(float saldo, LocalDate data) {
        this.saldo = saldo;
        this.data = data;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Caixa{" + "saldo=" + saldo + ", data=" + data + '}';
    }
   
   
}
