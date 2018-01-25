/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Funcionario {
    
    private String nome;
    private String telefone;
    private LocalDate dataPagamenoto;
    private LocalDate dataAdmissao;
    private String CPF;

    public Funcionario(String nome, String telefone, LocalDate dataPagamenoto,
            LocalDate dataAdmissao, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataPagamenoto = dataPagamenoto;
        this.dataAdmissao = dataAdmissao;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataPagamenoto() {
        return dataPagamenoto;
    }

    public void setDataPagamenoto(LocalDate dataPagamenoto) {
        this.dataPagamenoto = dataPagamenoto;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", telefone=" + telefone +
                ", dataPagamenoto=" + dataPagamenoto + ", dataAdmissao=" +
                dataAdmissao + ", CPF=" + CPF + '}';
    }
       
}
