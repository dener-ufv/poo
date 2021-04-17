/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import java.util.ArrayList;
import java.util.Date;
import model.entities.Venda;
import persistence.interfaces.IVendaDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */
public class VendaDAO implements IVendaDAO {
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    private static int vendaID = 1;

    @Override
    public void adicionarVenda(Venda venda) {
        venda.setVendaID(vendaID++);
        this.db.vendas.add(venda);
    }

    @Override
    public ArrayList<Venda> buscarPorDataMinima(Date minDate) {
        ArrayList<Venda> vendas = new ArrayList<>();
        for(Venda v : this.db.vendas) {
            Date data = v.getData();
            if(data.after(minDate) || data.equals(minDate)) {
                vendas.add(v);
            }
        }
        return vendas;
    }

    @Override
    public ArrayList<Venda> buscarPorDataMaxima(Date maxDate) {
        ArrayList<Venda> vendas = new ArrayList<>();
        for(Venda v : this.db.vendas) {
            Date data = v.getData();
            if(data.before(maxDate) || data.equals(maxDate)) {
                vendas.add(v);
            }
        }
        return vendas;
    }

    @Override
    public ArrayList<Venda> buscarPorIntervalo(Date minDate, Date maxDate) {
        ArrayList<Venda> vendas = new ArrayList<>();
        for(Venda v : this.db.vendas) {
            Date data = v.getData();
            if((data.after(minDate) || data.equals(minDate)) && (data.before(maxDate) || data.equals(maxDate))) {
                vendas.add(v);
            }
        }
        return vendas;
    }

    @Override
    public ArrayList<Venda> recuperarTodas() {
        return this.db.vendas;
    }
    
    
}
