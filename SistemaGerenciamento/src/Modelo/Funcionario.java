/**
 *
 * @author RODGER
 */

package Modelo;

import java.time.LocalDate;

public class Funcionario {
    
    private String nome;
    private String telefone;
    private float salario;
    private LocalDate dataAdmissao;
    private String CPF;

    public Funcionario(String nome, String telefone, float salario,
            LocalDate dataAdmissao, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setDataPagamenoto(float salario) {
        this.salario = salario;
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
                ", salario=" + salario + ", dataAdmissao=" +
                dataAdmissao + ", CPF=" + CPF + '}';
    }
       
}
