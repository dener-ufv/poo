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
public class CategoriaDeProduto {
    int codigo;
    String nome;
    String descricao;

    public CategoriaDeProduto(String categoria, String descricao) {
        this.nome = categoria;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "CategoriaDeProduto{" + "categoria=" + nome + ", descricao=" + descricao + '}';
    }
    
    
}
