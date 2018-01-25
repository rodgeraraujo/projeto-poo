/**
 *
 * @author RODGER
 */

package Modelo;

public class Peca {
    
    private String nome;
    private int quantidade;
    private float valor;
    private int ID;

    public Peca(String nome, int quantidade, float valor, int ID) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pe\u00e7a{" + "nome=" + nome + ", quantidade=" + quantidade +
                ", valor=" + valor + ", ID=" + ID + '}';
    }
    
}
