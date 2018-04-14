package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 * @verson 1.0
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @date 18/03/2018
 */
public class Cliente implements Serializable{
    
    private String cpf;
    private String endereco;
    private String  nome;
    private String telefone;
    private int id;
    
    /**
     * 
     * @param cpf número do CPF do cliente
     * @param endereco endereço do cliente
     * @param nome nome do cliente
     * @param telefone número do(s) telefone(s) do cliente
     */
    public Cliente(String cpf,String endereco, String nome,
           String telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    
    //Construtor gerado pelo erro, em DADOS
    public Cliente(String cpf, Object object, String nome, Object object0, int codCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return retorna o CPF do cliente
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
     * @return retorna o endereço do cliente
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
     * @return retorna o nome do cliente
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
     * @return retorna o(s) telefone(s) do cliente
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
     * @return retorna a descrição do cliente
     */
    @Override
    public String toString() {
        return "\nCLIENTE\n" 
                + "CPF:" + cpf + "\n"
                + "Endereço: " + endereco + "\n"
                + "Nome: " + nome +  "\n"
                + "Telefone(s): " + telefone;
    }
    
}
