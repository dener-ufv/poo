/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author dener
 */
public class TipoDeProduto {
    int codigo;
    String nome;
    String descricao;
    
    public TipoDeProduto(String tipo, String descricao) {
        this.nome = tipo;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return this.nome;
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
        return "TipoDeProduto{" + "tipo=" + nome + ", descricao=" + descricao + '}';
    }
    
    
}
