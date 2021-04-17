/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.Objects;

/**
 *
 * @author dener
 */
public class Produto {
    private int produtoID;
    private String nome;
    private String descricao;
    private double precoUnitario;
    private TipoDeProduto tipoDeProduto;
    private CategoriaDeProduto categoriaDeProduto;

    public Produto(String nome, String descricao, TipoDeProduto tipoDeProduto, CategoriaDeProduto categoriaDeProduto, double precoUnitario) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoDeProduto = tipoDeProduto;
        this.categoriaDeProduto = categoriaDeProduto;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public TipoDeProduto getTipoDeProduto() {
        return tipoDeProduto;
    }

    public CategoriaDeProduto getCategoriaDeProduto() {
        return categoriaDeProduto;
    } 

    public int getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(int produtoID) {
        this.produtoID = produtoID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoDeProduto, other.tipoDeProduto)) {
            return false;
        }
        if (!Objects.equals(this.categoriaDeProduto, other.categoriaDeProduto)) {
            return false;
        }
        return true;
    }
}
