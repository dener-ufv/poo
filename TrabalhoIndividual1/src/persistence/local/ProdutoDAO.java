/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import model.Produto;
import persistence.interfaces.IProdutoDAO;

/**
 *
 * @author dener
 */
public class ProdutoDAO implements IProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    
    @Override
    public void adicionarProduto(Produto produto) {
        produto.setCodigo(db.getNextProdutoID());
        db.produtos.add(produto);
    }

    @Override
    public void editarProduto(Produto produto) {
        for(int i=0; i<db.produtos.size(); i++) {
            if(db.produtos.get(i).getCodigo() == produto.getCodigo()) {
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
