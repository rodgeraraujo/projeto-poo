/**
 *
 * @author Lucas
 */
package Modelo;

import java.time.LocalDate;

public class Bancada extends Servico{
    private String tipo;

    public Bancada(String tipo, String defeito, String descricao, float orcamento, LocalDate dataEntrada, String ordemServico, String estado) {
        super(defeito, descricao, orcamento, dataEntrada, ordemServico, estado);
        this.tipo = tipo;
    }

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bancada{" + "tipo=" + tipo + '}';
    }
    
    
}
