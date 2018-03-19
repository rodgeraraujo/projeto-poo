package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Equipamento {
    
    private String numSerie;
    private String tipo;
    private String acessorios;
    private String marca;
    private String modelo;

    /**
     * 
     * @param numSerie número de série do equipamento
     * @param tipo tipo do equipamento(PC, Impressora, Notebook, TV, etc)
     * @param acessorios acessórios que acomponham o equipamento
     * @param marca marca do equipamento
     * @param modelo modelo do equipamento
     */
    public Equipamento(String numSerie, String tipo, String acessorios,
            String marca, String modelo) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.acessorios = acessorios;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return retorna o nuúmero de série
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * @param numSerie 
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * @return retorna o tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * 
     * @return os acessórios
     */
    public String getAcessorios() {
        return acessorios;
    }

    /**
     * @param acessorios 
     */
    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    /**
     * @return retorna a marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return retorna o modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return retorna a descrição do equipamento
     */
    @Override
    public String toString() {
        return "Equipamento{" + "numSerie=" + numSerie + ", tipo=" + tipo +
                ", acessorios=" + acessorios + ", marca=" + marca + ", modelo="
                + modelo + '}';
    }
    
}
