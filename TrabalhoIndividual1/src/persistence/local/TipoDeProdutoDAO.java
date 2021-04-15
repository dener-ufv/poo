/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import model.TipoDeProduto;
import persistence.interfaces.ITipoDeProdutoDAO;

/**
 *
 * @author dener
 */
public class TipoDeProdutoDAO implements ITipoDeProdutoDAO {
    
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();

    @Override
    public void adicionarTipo(TipoDeProduto tipoDeProduto) {
        tipoDeProduto.setCodigo(db.getNextTipoDeProdutoID());
        db.tiposDeProdutos.add(tipoDeProduto);
    }

    @Override
    public ArrayList<TipoDeProduto> recuperarTodosTipos() {
        return db.tiposDeProdutos;
    }
    
}
