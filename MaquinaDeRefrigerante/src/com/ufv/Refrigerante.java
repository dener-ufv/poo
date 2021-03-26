/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufv;

/**
 *
 * @author dener
 */
public enum Refrigerante {
    TIPO1("Tipo 1", 100),
    TIPO2("Tipo 2", 200),
    TIPO3("Tipo 3", 300),
    TIPO4("Tipo 4", 400),
    TIPO5("Tipo 5", 500);
    
    private int preco=0;
    String nome;
    
    Refrigerante(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
