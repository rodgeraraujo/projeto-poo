/**
 *
 * @author RODGER
 */

package Modelo;

public class Peca {
    
    private String nome;
    private int quantidade;
    private float valor;
    private int id;

    public Peca(String nome, int quantidade, float valor, int id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pe\u00e7a{" + "nome=" + nome + ", quantidade=" + quantidade +
                ", valor=" + valor + ", id=" + id + '}';
    }
    
}
