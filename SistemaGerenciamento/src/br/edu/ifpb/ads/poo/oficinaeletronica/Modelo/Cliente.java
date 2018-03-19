package br.edu.ifpb.ads.poo.oficinaeletronica.Modelo;

import java.util.Arrays;

/**
 * 
 * @verson 1.0
 * @author Lucas Garrido <lucasgf07@gmail.com>
 * @author Rogério Araújo <rogerio.aruajo@mail.com>
 * @date 18/03/2018
 */
public class Cliente {
    
    private String cpf;
    private Endereco[] endereco;
    private String  nome;
    private String telefone[];
    
    /**
     * 
     * @param cpf número do CPF do cliente
     * @param endereco endereço do cliente
     * @param nome nome do cliente
     * @param telefone número do(s) telefone(s) do cliente
     */
    public Cliente(String cpf,Endereco[] endereco, String nome,
           String[] telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
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
    public Endereco[] getEndereco() {
        return endereco;
    }

    /**
     * @param endereco 
     */
    public void setEndereco(Endereco[] endereco) {
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
    public String[] getTelefone() {
        return telefone;
    }

    /**
     * @param telefone 
     */
    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    /**
     * @return retorna a descrição do cliente
     */
    @Override
    public String toString() {
        return "\nCLIENTE\n" 
                + "CPF:" + cpf + "\n"
                + "Endereço" + Arrays.toString(endereco) + "\n"
                + "Nome: " + nome +  "\n"
                + "Telefone(s): " + Arrays.toString(telefone);
    }
    
}
