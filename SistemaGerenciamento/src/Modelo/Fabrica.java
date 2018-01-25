/**
 *
 * @author Lucas
 */
package Modelo;

public class Fabrica {
   private String nome;
   private int ordemServico;

    public Fabrica(String nome, int ordemServico) {
        this.nome = nome;
        this.ordemServico = ordemServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    @Override
    public String toString() {
        return "Fabrica{" + "nome=" + nome + ", ordemServico=" + ordemServico + '}';
    }
   
}
