/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Servico {

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
           LocalDate dataEntrada, int ordemServico, String estado) {
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
