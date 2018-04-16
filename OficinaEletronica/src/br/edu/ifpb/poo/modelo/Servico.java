package br.edu.ifpb.poo.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Servico implements Serializable {

    private String defeito;
    private String descricao;
    private String orcamento;
    private LocalDate dataEntrada;
    private String status;
    private int ordemServico;
    
    
    /**
     * Construtor default
     */
    public Servico(){
    }
    
    /**
     * 
     * @param defeito defeito alegado pelo cliente
     * @param descricao descricao do equipamento
     * @param orcamento valor do serviço
     * @param status estado atual do serviço
     * @param ordemServico número de identificação do serviço
     */
    public Servico(String defeito, String descricao, String orcamento, 
            String status, int ordemServico){
        this.defeito = defeito;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.status = status;
        this.ordemServico = ordemServico;
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
    public String getOrcamento() {
        return orcamento;
    }

    /**
     * @param orcamento 
     */
    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    /**
     * @return retorna a data de entrada do serviço
     */
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    /**
     * 
     * @param dataEntrada 
     */
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return retorna o status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return o número da Ordem de Serviço
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.defeito);
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + Objects.hashCode(this.orcamento);
        hash = 37 * hash + Objects.hashCode(this.dataEntrada);
        hash = 37 * hash + Objects.hashCode(this.status);
        hash = 37 * hash + this.ordemServico;
        return hash;
    }

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
        if (this.ordemServico != other.ordemServico) {
            return false;
        }
        if (!Objects.equals(this.defeito, other.defeito)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.orcamento, other.orcamento)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.dataEntrada, other.dataEntrada)) {
            return false;
        }
        return true;
    }

    
    
    
}
