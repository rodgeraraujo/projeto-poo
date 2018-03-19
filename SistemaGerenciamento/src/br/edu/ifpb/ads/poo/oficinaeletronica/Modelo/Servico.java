package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

/**
 *
 * @version 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogeiro.araujo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 * 
 */
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Servico {

    private String defeito;
    private String descricao;
    private float orcamento;
    private LocalDate dataEntrada;
    private int ordemServico;
    private String estado;
    private Peca[] pecas;
    private Equipamento[] equipamento;
    private Funcionario[] funcionario;
    
    /**
     * 
     * @param defeito defeito do equipamento
     * @param descricao descrição do serviço
     * @param orcamento orçamento do serviço
     * @param dataEntrada data de entrada do equipamento
     * @param ordemServico código identificador do serviço
     * @param estado status do serviço
     * @param pecas peças utilizadas no serviço

     */
    public Servico(String defeito, String descricao, float orcamento,
           LocalDate dataEntrada, int ordemServico, String estado, Peca pecas[])
    {
        this.defeito = defeito;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.dataEntrada = dataEntrada;
        this.ordemServico = ordemServico;
        this.estado = estado;
        this.pecas = pecas;
    }

    /**
     * @return retorna o defeito
     */
    public String getDefeito() {
        return defeito;
    }

    /**
     * @param defeito 
     */
    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    /**
     * @return retorna o estado
     */ 
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return retorna a descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return retorna o orçamento
     */
    public float getOrcamento() {
        return orcamento;
    }
    
    /**
     * @param orcamento 
     */
    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    /**
     * @return retorna a data de entrada do serviço
     */
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada 
     */
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return retorna a ordem do serviço
     */
    public int getOrdemServico() {
        return ordemServico;
    }

    /**
     * @param ordemServico 
     */
    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    /**
     * @return retorna as peças
     */
    public Peca[] getPecas() {
        return pecas;
    }

     /**
     * @param pecas
     */
    public void setPecas(Peca[] pecas) {
        this.pecas = pecas;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.defeito);
        hash = 71 * hash + Objects.hashCode(this.descricao);
        hash = 71 * hash + Float.floatToIntBits(this.orcamento);
        hash = 71 * hash + Objects.hashCode(this.dataEntrada);
        hash = 71 * hash + this.ordemServico;
        hash = 71 * hash + Objects.hashCode(this.estado);
        hash = 71 * hash + Arrays.deepHashCode(this.pecas);
        hash = 71 * hash + Arrays.deepHashCode(this.equipamento);
        hash = 71 * hash + Arrays.deepHashCode(this.funcionario);
        return hash;
    }

    /**
     * 
     * @param obj a ser comparado
     * @return retorna true se forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servico other = (Servico) obj;
        if (Float.floatToIntBits(this.orcamento) != Float.floatToIntBits(other.orcamento)) {
            return false;
        }
        if (this.ordemServico != other.ordemServico) {
            return false;
        }
        if (!Objects.equals(this.defeito, other.defeito)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        if (!Arrays.deepEquals(this.pecas, other.pecas)) {
            return false;
        }
        if (!Arrays.deepEquals(this.equipamento, other.equipamento)) {
            return false;
        }
        if (!Arrays.deepEquals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "\nSERVIÇO\n"
                + "Defeito: " + defeito + "\n" 
                + "Descrição: " + descricao + "\n"
                + "Orçamento: R$" + orcamento + "\n"
                + "Data Entrada: " + dataEntrada + "\n"
                + "Ordem do Serviço: " + ordemServico + "\n"
                + "Estado: " + estado + "\n"
                + "Pecas: " + Arrays.toString(pecas) + "\n\n";
    }
    
}
