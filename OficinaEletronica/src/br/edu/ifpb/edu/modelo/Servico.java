package br.edu.ifpb.edu.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Lucas
 */
public class Servico implements Serializable {

    private String defeito;
    private String descricao;
    private String orcamento;
    private LocalDate dataEntrada;
    private String status;
    private int ordemServico;
    
    
    
    public Servico(){
        
    }
    
    public Servico(String defeito, String descricao, String orcamento, 
            String status, int ordemServico){
        this.defeito = defeito;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.status = status;
        this.ordemServico = ordemServico;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrdemServico() {
        return ordemServico;
    }

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
