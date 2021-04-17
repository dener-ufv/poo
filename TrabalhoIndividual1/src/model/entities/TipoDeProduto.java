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
public class TipoDeProduto {
    String nome;
    String descricao;
    
    public TipoDeProduto(String tipo, String descricao) {
        this.nome = tipo;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public String toString() {
        return "TipoDeProduto{" + "tipo=" + nome + ", descricao=" + descricao + '}';
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
        final TipoDeProduto other = (TipoDeProduto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
