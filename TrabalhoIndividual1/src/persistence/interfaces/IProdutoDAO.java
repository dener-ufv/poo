/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import model.entities.Produto;

/**
 *
 * @author dener
 */
public interface IProdutoDAO {
    public void adicionarProduto(Produto produto);
    public void editarProduto(Produto produto);
    public Produto buscarPorNome(String nome);
    public ArrayList<Produto> recuperarTodosProdutos();
}
