/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.entities.CategoriaDeProduto;
import model.entities.Produto;
import model.entities.QuantidadeDeProduto;
import model.entities.TipoDeProduto;
import persistence.interfaces.ICategoriaDeProdutoDAO;
import persistence.interfaces.IEstoqueDAO;
import persistence.interfaces.IProdutoDAO;
import persistence.interfaces.ITipoDeProdutoDAO;

/**
 *
 * @author dener
 */
public class ProdutoController {
    private final IProdutoDAO produtoDAO;
    private final ICategoriaDeProdutoDAO categoriaDeProdutoDAO;
    private final ITipoDeProdutoDAO tipoDeProdutoDAO;
    private final IEstoqueDAO estoqueDAO;

    public ProdutoController(IProdutoDAO produtoDAO, ICategoriaDeProdutoDAO categoriaDeProdutoDAO, ITipoDeProdutoDAO tipoDeProdutoDAO, IEstoqueDAO estoqueDAO) {
        this.produtoDAO = produtoDAO;
        this.categoriaDeProdutoDAO = categoriaDeProdutoDAO;
        this.tipoDeProdutoDAO = tipoDeProdutoDAO;
        this.estoqueDAO = estoqueDAO;
    }

    public boolean criarProduto(String nome, String descricao, double precoUnitario, int estoque, CategoriaDeProduto categoria, TipoDeProduto tipo) {
        if(nome == null || descricao == null || precoUnitario <= 0 || estoque < 0 || categoria == null || tipo == null) return false;
        if(nome.length() == 0 || descricao.length() == 0) return false;
        
        Produto produto = new Produto(nome, descricao, tipo, categoria, precoUnitario);
        
        if(this.produtoDAO.buscarPorNome(nome) != null) {
            return false;
        }
        
        this.produtoDAO.adicionarProduto(produto);
        this.estoqueDAO.adicionarProdutoNoEstoque(produto, estoque); 
        
        return true;
    }
    
    public void adicionarNoEstoque(Produto produto, int quantidade) {
        this.estoqueDAO.adicionarProdutoNoEstoque(produto, quantidade);
    }

    public Produto buscarPorNome(String nome) {
        return produtoDAO.buscarPorNome(nome);
    }
    
    public ArrayList<Produto> recuperarTodos() {
        return this.produtoDAO.recuperarTodosProdutos();
    }
    
    public int estoqueDoProduto(Produto produto) {
        return this.estoqueDAO.recuperarQuantidadeDoProduto(produto);
    }
}