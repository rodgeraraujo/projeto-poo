/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Servico {
    
    private String defeito;
    private String descricao;
    private LocalDate dataEntrada;
    private String ordemServico;

    public Servico(String defeito, String descricao, LocalDate dataEntrada, String ordemServico) {
        this.defeito = defeito;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
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
        return "Servico{" + "defeito=" + defeito + ", descricao=" + descricao + ", dataEntrada=" + dataEntrada + ", ordemServico=" + ordemServico + '}';
    }
    
}
