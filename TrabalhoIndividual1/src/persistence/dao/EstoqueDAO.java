/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import model.entities.Produto;
import persistence.interfaces.IEstoqueDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */
public class EstoqueDAO implements IEstoqueDAO {
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();

    @Override
    public void adicionarProdutoNoEstoque(Produto produto, int quantidade) {
        if(this.db.quantidadeDeProdutos.containsKey(produto)) {
            this.db.quantidadeDeProdutos.replace(produto, quantidade + db.quantidadeDeProdutos.get(produto));
        } else {
            this.db.quantidadeDeProdutos.put(produto, quantidade);
        }
    }

    @Override
    public void removerProdutoDoEstoque(Produto produto, int quantidade) {
        if(this.db.quantidadeDeProdutos.containsKey(produto)) {
            this.db.quantidadeDeProdutos.replace(produto, db.quantidadeDeProdutos.get(produto) - quantidade);
        }
    }

    @Override
    public int recuperarQuantidadeDoProduto(Produto produto) {
        return this.db.quantidadeDeProdutos.get(produto);
    }
}
