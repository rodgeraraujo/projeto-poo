package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 * 
 * @verson 1.0
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @date 18/03/2018
 */
public class Seguradora {
    private String nome;
    private String numChamado;

   /**
    * 
    * @param nome nome da seguradora resposável pela garantia extendida
    * @param numChamado código identificador gerado pelas seguradoras
    */
    public Seguradora(String nome, String numChamado) {
        this.nome = nome;
        this.numChamado = numChamado;
    }

    /**
     * @return nome da seguradora
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
     * @return retorna o número do chamado
     */
    public String getNumChamado() {
        return numChamado;
    }

    /**
     * @param numChamado 
     */
    public void setNumChamado(String numChamado) {
        this.numChamado = numChamado;
    }

    /**
     * @return descrição da seguradora
     */
    @Override
    public String toString() {
        return "\nSEGURADORA\n" 
                + "Nome: " + nome 
                + "Númeor do Chamado: " + numChamado;
    }
   
   
}
