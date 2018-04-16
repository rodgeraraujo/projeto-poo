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
public class Cliente implements Serializable {

    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    
    /**
     * Costrutor default
     */
    public Cliente(){
    }
    
    /**
     * 
     * @param cpf cpf do cliente
     * @param nome nome do cliente
     * @param endereco endereco do cliente
     * @param telefone telefone para contato do cliente
     */
    public Cliente(String cpf, String nome, String endereco, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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
     * @return retorna o endereço
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return retorna o telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * 
     * @param telefone 
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.cpf);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.endereco);
        hash = 83 * hash + Objects.hashCode(this.telefone);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", endereco=" + 
                endereco + ", telefone=" + telefone + '}';
    }
    
    
    
}
