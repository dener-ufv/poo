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
public class ItemDaVenda {
    private int codigo;
    private final int produtoID;
    private final int quantidade;

    public ItemDaVenda(int produtoID, int quantidade) {
        this.produtoID = produtoID;
        this.quantidade = quantidade;
    }
    
    int getCodigo() {
        return this.codigo;
    }

    int getProdutoID() {
        return this.produtoID;
    }

    int getQuantidade() {
        return this.quantidade;
    }
    
    void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
