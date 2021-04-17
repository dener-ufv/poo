/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import model.entities.CategoriaDeProduto;

/**
 *
 * @author dener
 */
public interface ICategoriaDeProdutoDAO {
    void adicionarCategoria(CategoriaDeProduto categoriaDeProduto);
    ArrayList<CategoriaDeProduto> recuperarTodasCategorias();
    CategoriaDeProduto buscarPorNome(String nome);
}
