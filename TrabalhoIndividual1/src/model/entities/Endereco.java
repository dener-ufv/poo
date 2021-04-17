/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author dener
 */
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private int numero;

    public Endereco(String rua, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public int getNumero() {
        return numero;
    }
    
}
