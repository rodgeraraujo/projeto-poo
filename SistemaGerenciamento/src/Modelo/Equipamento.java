/**
 *
 * @author RODGER
 */

package Modelo;

public class Equipamento {
    
    private String numSerie;
    private String tipo;
    private String acessorios;
    private String marca;
    private String modelo;

    public Equipamento(String numSerie, String tipo, String acessorios,
            String marca, String modelo) {
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.acessorios = acessorios;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "numSerie=" + numSerie + ", tipo=" + tipo +
                ", acessorios=" + acessorios + ", marca=" + marca + ", modelo="
                + modelo + '}';
    }
    
}
