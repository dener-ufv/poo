/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import model.entities.TipoDeProduto;

/**
 *
 * @author dener
 */
public interface ITipoDeProdutoDAO {
    void adicionarTipo(TipoDeProduto tipoDeProduto);
    ArrayList<TipoDeProduto> recuperarTodosTipos();
    TipoDeProduto buscarPorNome(String nome);
}
