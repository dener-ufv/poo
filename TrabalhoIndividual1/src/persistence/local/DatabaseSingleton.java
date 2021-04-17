/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.entities.CategoriaDeProduto;
import model.entities.Cliente;
import model.entities.Endereco;
import model.entities.Produto;
import model.entities.QuantidadeDeProduto;
import model.entities.TipoDeProduto;
import model.entities.Venda;

/**
 *
 * @author dener
 */
public final class DatabaseSingleton {
    private static final DatabaseSingleton instance = new DatabaseSingleton();
    
    public ArrayList<Produto> produtos = new ArrayList<>();
    public ArrayList<Cliente> clientes = new ArrayList<>();
    public ArrayList<Venda> vendas = new ArrayList<>();
    public ArrayList<TipoDeProduto> tiposDeProdutos = new ArrayList<>();
    public ArrayList<CategoriaDeProduto> categoriaDeProdutos = new ArrayList<>();
    public ArrayList<Endereco> enderecos = new ArrayList<>();
    public Map<Produto, Integer> quantidadeDeProdutos = new HashMap<>();
    
    private DatabaseSingleton() {}
    
    public static DatabaseSingleton getInstance() {
        return instance;
    } 
}
