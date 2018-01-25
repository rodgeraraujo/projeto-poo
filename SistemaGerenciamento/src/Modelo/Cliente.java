/**
 *
 * @author Lucas
 */
package Modelo;

public class Cliente {
    
    private String cpf;
    private String rua;
    private String bairro;
    private int numero;
    private String  nome;
    private String telefone[];

    public Cliente(String cpf, String rua, String bairro, int numero, String nome, String[] telefone) {
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return "Cliente{" + "CPF=" + cpf + ", rua=" + rua + ", bairro=" + bairro + ", numero=" + numero + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
}
