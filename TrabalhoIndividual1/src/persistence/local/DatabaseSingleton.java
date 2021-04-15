/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import model.CategoriaDeProduto;
import model.Cliente;
import model.Produto;
import model.TipoDeProduto;
import model.Venda;

/**
 *
 * @author dener
 */
public final class DatabaseSingleton {
    private static final DatabaseSingleton instance = new DatabaseSingleton();
    
    private int produtosID = 1;
    private int clientesID = 1;
    private int vendasID = 1;
    private int tipoDeProdutosID = 1;
    private int categoriaDeProdutosID = 1; 

    public ArrayList<Produto> produtos = new ArrayList<>();
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Venda> vendas = new ArrayList<>();
    public ArrayList<TipoDeProduto> tiposDeProdutos = new ArrayList<>();
    public ArrayList<CategoriaDeProduto> categoriaDeProdutos = new ArrayList<>();
    
    private DatabaseSingleton() {}
    
    public static DatabaseSingleton getInstance() {
        return instance;
    }

    public int getNextProdutoID() {
        return this.produtosID++;
    }

    public int getNextClienteID() {
        return this.clientesID++;        
    }

    public int getNextVendaID() {
        return this.vendasID++;
    }

    public int getNextTipoDeProdutoID() {
        return this.tipoDeProdutosID++;
    }

    public int getNextCategoriaDeProdutoID() {
        return this.categoriaDeProdutosID++;
    }
}
