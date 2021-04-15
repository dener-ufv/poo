/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Produto;
import persistence.interfaces.IProdutoDAO;

/**
 *
 * @author dener
 */
public class ProdutoController {
    private IProdutoDAO produtoDAO;

    public ProdutoController(IProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public boolean criarProduto(String nome, String descricao, double precoUnitario, int estoque, int categoriaID, int tipoID) {
        if(nome == null || nome.length() == 0 || precoUnitario < 0 || estoque < 0 || this.buscarPorNome(nome) != null) 
            return false;
        Produto produto = new Produto(nome, descricao, estoque, tipoID, categoriaID, precoUnitario);
        produtoDAO.adicionarProduto(produto);
        return true;
    }

    public Produto buscarPorNome(String nome) {
        return produtoDAO.buscarPorNome(nome);
    }    
}
