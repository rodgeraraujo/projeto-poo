
package br.edu.ifpb.poo.modelo;

import java.io.Serializable;
import java.util.Objects;
/**
 * 
 * @verson 1.0
 * @since version 1.0
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @date 18/03/2018
 */
public class Funcionario implements Serializable {

    private String cpf;
    private String nome;
    private String salario;
    private String telefone;
    private String senha;
    
    /**
     * Construtor default
     */
    public Funcionario(){
    }
    
    /**
     * 
     * @param cpf cpf do funcionário
     * @param nome nome do funcionário
     * @param telefone telefone de contato para o funcionário
     * @param salario  salario do funcionario
     */
    public Funcionario(String cpf, String nome, String telefone, String salario){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    /**
     * @return retorna o cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return retorna o nome
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
     * @return retorna salário
     */
    public String getSalario() {
        return salario;
    }

    /**
     * @param salario
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

    /**
     * @return retorna o telefone
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.salario);
        hash = 67 * hash + Objects.hashCode(this.telefone);
        hash = 67 * hash + Objects.hashCode(this.senha);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }

   

    
    
}
