/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import model.CategoriaDeProduto;
import persistence.interfaces.ICategoriaDeProdutoDAO;

/**
 *
 * @author dener
 */
public class CategoriaDeProdutoDAO implements ICategoriaDeProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    
    @Override
    public void adicionarCategoria(CategoriaDeProduto categoriaDeProduto) {
        categoriaDeProduto.setCodigo(db.getNextCategoriaDeProdutoID()); 
        db.categoriaDeProdutos.add(categoriaDeProduto);
    }

    @Override
    public ArrayList<CategoriaDeProduto> recuperarTodasCategorias() {
        return db.categoriaDeProdutos;
    }
    
    
    
}
