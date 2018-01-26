/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Servico {
    
    private String defeito;
    private String descricao;
    private float orcamento;
    private LocalDate dataEntrada;
    private String ordemServico;
    private String estado;

    public Servico(String defeito, String descricao, float orcamento, LocalDate dataEntrada, String ordemServico, String estado) {
        this.defeito = defeito;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.dataEntrada = dataEntrada;
        this.ordemServico = ordemServico;
        this.estado = estado;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(String ordemServico) {
        this.ordemServico = ordemServico;
    }

    @Override
    public String toString() {
        return "Servico{" + "defeito=" + defeito + ", descricao=" + descricao + ", orcamento=" + orcamento + ", dataEntrada=" + dataEntrada + ", ordemServico=" + ordemServico + '}';
    }

}
