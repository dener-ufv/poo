/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import java.util.ArrayList;
import model.entities.CategoriaDeProduto;
import persistence.interfaces.ICategoriaDeProdutoDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */
public class CategoriaDeProdutoDAO implements ICategoriaDeProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    
    @Override
    public void adicionarCategoria(CategoriaDeProduto categoriaDeProduto) {
        db.categoriaDeProdutos.add(categoriaDeProduto);
    }

    @Override
    public ArrayList<CategoriaDeProduto> recuperarTodasCategorias() {
        return db.categoriaDeProdutos;
    }

    @Override
    public CategoriaDeProduto buscarPorNome(String nome) {
        for(CategoriaDeProduto categoria : db.categoriaDeProdutos) {
            if(categoria.getNome().equals(nome)) return categoria;
        }
        return null;
    }
    
    
    
}
