/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import model.entities.Produto;

/**
 *
 * @author dener
 */
public interface IEstoqueDAO {
    public void adicionarProdutoNoEstoque(Produto produto, int quantidade);
    public void removerProdutoDoEstoque(Produto produto, int quantidade);
    public int recuperarQuantidadeDoProduto(Produto produto);
}
