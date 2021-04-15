/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dener
 */
public class Cliente {
    int codigo;
    String cpf;
    String nome;
    String email;
    String senha;
    ArrayList<Integer> enderecoIDs;

    public Cliente(String cpf, String nome, String email, String senha) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.enderecoIDs = new ArrayList<>();
    }
    
    public void adicionarEndereco(int enderecoID) {
        this.enderecoIDs.add(enderecoID);
    }
    
    public Cliente(String cpf, String nome, String email, String senha, String endereco) {
        this(cpf, nome, email, senha);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private class Endereco {
        private final String endereco;
        
        public Endereco(String endereco) {
            this.endereco = endereco;
        }
        
        public String getEndereco() {
            return this.endereco;
        }
    }
}
