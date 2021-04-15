/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dener
 */
public class Produto {
    int codigo;
    String nome;
    String descricao;
    int estoque;
    double precoUnitario;
    int tipoDeProdutoID;
    int categoriaDeProdutoID;

    public Produto(String nome, String descricao, int estoque, int tipoDeProdutoID, int categoriaDeProdutoID, double precoUnitario) {
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.tipoDeProdutoID = tipoDeProdutoID;
        this.categoriaDeProdutoID = categoriaDeProdutoID;
        this.precoUnitario = precoUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getTipoDeProdutoID() {
        return tipoDeProdutoID;
    }

    public int getCategoriaDeProdutoID() {
        return categoriaDeProdutoID;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
