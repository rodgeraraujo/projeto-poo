package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Endereco {
    private String rua;
    private String bairro;
    private int numero;

    /**
     * 
     * @param rua rua que reside o cliente
     * @param bairro bairro que reside o cliente
     * @param numero numero da casa que reside o cliente
     */
    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    /**
     * 
     * @return retorna rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * 
     * @param rua 
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * 
     * @return retorna bairro 
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * 
     * @param bairro 
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * 
     * @return retorna numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * 
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", bairro=" + bairro + ", numero=" +
                numero + '}';
    }
    
}
