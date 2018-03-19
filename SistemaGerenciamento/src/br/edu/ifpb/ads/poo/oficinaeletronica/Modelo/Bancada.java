package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
import java.time.LocalDate;

public class Bancada extends Servico{
    private String tipo;
    private Seguradora[] seguradora;
    private Fabrica[] fabrica;


    /**
     * 
     * @param tipo tipo do serviço, se é particular ou garantia
     * @param defeito defeito do equipamento
     * @param descricao descrição do servico feito
     * @param orcamento valor do serviço
     * @param dataEntrada entrada do serviço
     * @param ordemServico código identificador do serviço
     * @param estado status do serviço
     * @param pecas peças utilizadas no serviço

     */
    public Bancada(String tipo, String defeito, String descricao,
           float orcamento, LocalDate dataEntrada, int ordemServico,
           String estado, Peca[] pecas) {
        super(defeito, descricao, orcamento, dataEntrada, ordemServico, estado,
                pecas);
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Bancada{" + "tipo=" + tipo + '}';
    }
        
}
