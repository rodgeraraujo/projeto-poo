package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Peca {
    
    private String nome;
    private int quantidade;
    private float valor;
    private int id;

     /**
     * 
     * @param nome nome da peça
     * @param quantidade quantidade da peça
     * @param valor valor da peça
     * @param id identificador da peça
     */
    public Peca(String nome, int quantidade, float valor, int id) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.id = id;
    }

    /**
     * @return retorna o nome da peça
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return retorna a quantidade da peça
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade 
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    /**
     * @return retorna o valor da peça
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor 
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return retorna o identificador da peça
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return retorna descrição da peça
     */
    @Override
    public String toString() {
        return "\nPE\u00e7A\n"
                + "Nome: " + nome + "\n"
                + "Quantidade: " + quantidade + "\n"
                + "Valor: " + valor + "\n"
                + "ID:" + id;
    }
    
}
