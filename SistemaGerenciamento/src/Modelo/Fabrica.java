package Modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Fabrica {
   private String nome;
   private int ordemServico;

   /**
    * 
    * @param nome nome da fábrica responsável pela garantia
    * @param ordemServico código identificador gerado pela fábrica
    */
    public Fabrica(String nome, int ordemServico) {
        this.nome = nome;
        this.ordemServico = ordemServico;
    }

    /**
     * 
     * @return retorna o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * 
     * @return retorna o número da ordem de serviço
     */
    public int getOrdemServico() {
        return ordemServico;
    }

    /**
     * 
     * @param ordemServico 
     */
    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    @Override
    public String toString() {
        return "Fabrica{" + "nome=" + nome + ", ordemServico=" + ordemServico +
                '}';
    }
   
}
