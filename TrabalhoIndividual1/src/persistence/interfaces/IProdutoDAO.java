/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author dener
 */
public interface IProdutoDAO {
    void adicionarProduto(Produto produto);
    void editarProduto(Produto produto);
    Produto buscarPorNome(String nome);
    ArrayList<Produto> recuperarTodosProdutos();
}
