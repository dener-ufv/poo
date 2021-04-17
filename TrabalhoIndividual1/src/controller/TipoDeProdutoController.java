/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.entities.TipoDeProduto;
import persistence.interfaces.ITipoDeProdutoDAO;

/**
 *
 * @author dener
 */
public class TipoDeProdutoController {
    private final ITipoDeProdutoDAO tipoDeProdutoDAO;

    public TipoDeProdutoController(ITipoDeProdutoDAO tipoDeProdutoDAO) {
        this.tipoDeProdutoDAO = tipoDeProdutoDAO;
    }

    public boolean criarTipo(String nome, String descricao) {
        if(nome == null || nome.length() == 0) return false;
        if(this.tipoDeProdutoDAO.buscarPorNome(nome) != null) return false;
        TipoDeProduto tipo = new TipoDeProduto(nome, descricao);
        tipoDeProdutoDAO.adicionarTipo(tipo);
        return true;
    }

    public ArrayList<TipoDeProduto> recuperarTodos() {
        return this.tipoDeProdutoDAO.recuperarTodosTipos();
    }
}
