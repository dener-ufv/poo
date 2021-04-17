/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import java.util.ArrayList;
import model.entities.TipoDeProduto;
import persistence.interfaces.ITipoDeProdutoDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */
public class TipoDeProdutoDAO implements ITipoDeProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();

    @Override
    public void adicionarTipo(TipoDeProduto tipoDeProduto) {
        db.tiposDeProdutos.add(tipoDeProduto);
    }

    @Override
    public ArrayList<TipoDeProduto> recuperarTodosTipos() {
        return db.tiposDeProdutos;
    }

    @Override
    public TipoDeProduto buscarPorNome(String nome) {
        for(TipoDeProduto tipo : db.tiposDeProdutos) {
            if(tipo.getNome().equals(nome)) return tipo;
        }
        return null;
    }
}
