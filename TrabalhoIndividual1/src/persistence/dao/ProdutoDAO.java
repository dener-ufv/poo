/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import java.util.ArrayList;
import model.entities.Produto;
import persistence.interfaces.IProdutoDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */
public class ProdutoDAO implements IProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    private static int produtoID = 1;
    
    @Override
    public void adicionarProduto(Produto produto) {
        produto.setProdutoID(produtoID++);
        db.produtos.add(produto);
    }

    @Override
    public void editarProduto(Produto produto) {
        for(int i=0; i<db.produtos.size(); i++) {
            Produto p = db.produtos.get(i);
            if(p.getProdutoID() == produto.getProdutoID()) {
                db.produtos.set(i, produto);
                break;
            }
        }
    }

    @Override
    public Produto buscarPorNome(String nome) {
        for(Produto p : db.produtos) {
            if(p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Produto> recuperarTodosProdutos() {
        return db.produtos;
    }
    
}
