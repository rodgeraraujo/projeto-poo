/**
 *
 * @author Lucas
 */
package Modelo;

public class Seguradora {
   private String nome;
   private String numChamado;

    public Seguradora(String nome, String numChamado) {
        this.nome = nome;
        this.numChamado = numChamado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumChamado() {
        return numChamado;
    }

    public void setNumChamado(String numChamado) {
        this.numChamado = numChamado;
    }

    @Override
    public String toString() {
        return "Seguradora{" + "nome=" + nome + ", numChamado=" + numChamado +
                '}';
    }
   
   
}
