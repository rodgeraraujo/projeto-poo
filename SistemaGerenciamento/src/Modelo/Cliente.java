/**
 *
 * @author Lucas
 */
package Modelo;

import java.util.Arrays;

public class Cliente {
    
    private String cpf;
    private Endereco[] endereco;
    private String  nome;
    private String telefone[];

    public Cliente(String cpf,Endereco[] endereco, String nome,
           String[] telefone) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getTelefone() {
        return telefone;
    }

    public void setTelefone(String[] telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", endereco=" +
               Arrays.toString(endereco) + ", nome=" + nome + ", telefone=" +
               Arrays.toString(telefone) + '}';
    }
    
}
