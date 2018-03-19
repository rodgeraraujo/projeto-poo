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

public class Funcionario {
    
    private String nome;
    private String telefone;
    private float salario;
    private LocalDate dataAdmissao;
    private String CPF;

    /**
     * 
     * @param nome nome do funcionario
     * @param telefone numero(s) de telefone(s) do funcionário
     * @param salario salário do funcionário
     * @param dataAdmissao data de admissão do funcionário
     * @param CPF número do CPF do funcionário
     */
    public Funcionario(String nome, String telefone, float salario,
            LocalDate dataAdmissao, String CPF) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.CPF = CPF;
    }

    /**
     * @return retorna o nome do funcionário
     */
    public String getNome() {
        return nome;
    }

      /**
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    /**
     * @return retorna o(s) telefone(s) do funcionário
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return retorna o salário do funcionário
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario 
     */
    public void setDataPagamenoto(float salario) {
        this.salario = salario;
    }

    /**
     * @return retorna a data de admissão do funcionário
     */
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * @param dataAdmissao 
     */
    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    /**
     * @return retorna o número de CPF do funcionário
     */
    public String getCPF() {
        return CPF;
    }

     /**
     * @param CPF 
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    /**
     * @return retorna a descrição do funcionário
     */
    @Override
    public String toString() {
        return "\nFUNCIONÁRIO\n"
                + "Nome: " + nome + "\n"
                + "Telefone: " + telefone + "\n"
                + "Salaário: " + salario + "\n"
                + "Data de Admissao=" + dataAdmissao + "\n"
                + "CPF: " + CPF;
    }
       
}
