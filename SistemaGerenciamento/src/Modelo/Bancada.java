/**
 *
 * @author Lucas
 */
package Modelo;

import java.time.LocalDate;

public class Bancada extends Servico{
    private String tipo;
    private Seguradora[] seguradora;
    private Fabrica[] fabrica;

    public Bancada(String tipo, String defeito, String descricao,
           float orcamento, LocalDate dataEntrada, int ordemServico,
           String estado, Peca[] pecas) {
        super(defeito, descricao, orcamento, dataEntrada, ordemServico, estado,
                pecas);
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
