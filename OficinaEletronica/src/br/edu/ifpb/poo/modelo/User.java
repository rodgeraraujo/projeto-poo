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
public class User implements Serializable {

    private String nome;
    private String sobrenome;
    private String username;
    private String senha;
    
    /**
     * Construtor default
     */
    public User(){
    }

    /**
     * 
     * @param nome nome do usuário
     * @param sobrenome sobrenome do usuário
     * @param username nome utilizado para fazer login
     * @param senha senha ultilizada para fazer login
     */
    public User(String nome, String sobrenome, String username, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.username = username;
        this.senha = senha;
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
     * @return retorna o sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome 
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return retorna o username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return retorna a senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.sobrenome);
        hash = 89 * hash + Objects.hashCode(this.username);
        hash = 89 * hash + Objects.hashCode(this.senha);
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
        final User other = (User) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }
    
    
}
