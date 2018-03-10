/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;
import java.util.Arrays;

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

    public Servico(String defeito, String descricao, float orcamento,
           LocalDate dataEntrada, int ordemServico, String estado,
           Peca[] pecas) {
        this.defeito = defeito;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.dataEntrada = dataEntrada;
        this.ordemServico = ordemServico;
        this.estado = estado;
        this.pecas = pecas;
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

    public int getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    public Peca[] getPecas() {
        return pecas;
    }

    public void setPecas(Peca[] pecas) {
        this.pecas = pecas;
    }

    @Override
    public String toString() {
        return "Servico{" + "defeito=" + defeito + ", descricao=" + descricao +
               ", orcamento=" + orcamento + ", dataEntrada=" + dataEntrada +
               ", ordemServico=" + ordemServico + ", estado=" + estado +
               ", pecas=" + Arrays.toString(pecas) + '}';
    }
    
}
