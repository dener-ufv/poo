/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import java.util.Date;
import model.entities.Venda;

/**
 *
 * @author dener
 */
public interface IVendaDAO {
    void adicionarVenda(Venda venda);
    ArrayList<Venda> buscarPorDataMinima(Date minDate);
    ArrayList<Venda> buscarPorDataMaxima(Date maxDate);
    ArrayList<Venda> buscarPorIntervalo(Date minDate, Date maxDate);
    ArrayList<Venda> recuperarTodas();
}
