/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.entities.CategoriaDeProduto;
import persistence.interfaces.ICategoriaDeProdutoDAO;

/**
 *
 * @author dener
 */
public class CategoriaDeProdutoController {
    private final ICategoriaDeProdutoDAO categoriaDeProdutoDAO;

    public CategoriaDeProdutoController(ICategoriaDeProdutoDAO categoriaDeProdutoDAO) {
        this.categoriaDeProdutoDAO = categoriaDeProdutoDAO;
    }
    
    public boolean criarCategoria(String nome, String descricao) {
        if(nome == null || nome.length() == 0) return false;
        if(this.categoriaDeProdutoDAO.buscarPorNome(nome) != null) return false;
        CategoriaDeProduto categoriaDeProduto = new CategoriaDeProduto(nome, descricao);
        this.categoriaDeProdutoDAO.adicionarCategoria(categoriaDeProduto);
        return true;
    }
    
    public ArrayList<CategoriaDeProduto> recuperarTodas() {
        return this.categoriaDeProdutoDAO.recuperarTodasCategorias();
    }
}
