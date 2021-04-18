/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import model.entities.Cliente;
import model.entities.Endereco;
import model.entities.QuantidadeDeProduto;
import model.entities.Venda;
import persistence.interfaces.IEstoqueDAO;
import persistence.interfaces.IVendaDAO;

/**
 *
 * @author dener
 */
public class VendaController {
    private final IVendaDAO vendaDAO;
    private final IEstoqueDAO estoqueDAO;
    
    public VendaController(IVendaDAO vendaDAO, IEstoqueDAO estoqueDAO) {
        this.vendaDAO = vendaDAO;
        this.estoqueDAO = estoqueDAO;
    }
    
    public boolean adicionarVenda(Cliente cliente, Endereco endereco, Date data, ArrayList<QuantidadeDeProduto> items) {
        if(cliente == null || endereco == null || data == null || items == null || items.isEmpty()) return false;
        Venda venda = new Venda(cliente, endereco, data, items);
        for(QuantidadeDeProduto q : items) {
            this.estoqueDAO.removerProdutoDoEstoque(q.getProduto(), q.getQuantidade());
        }
        vendaDAO.adicionarVenda(venda);
        return true;
    }
    
    public ArrayList<Venda> buscarPorData(String diaInicio, String mesInicio, String anoInicio, String diaFinal, String mesFinal, String anoFinal) {
        Date dataInicio = parseData(diaInicio, mesInicio, anoInicio);
        Date dataFinal = parseData(diaFinal, mesFinal, anoFinal);
        
        if(dataInicio != null && dataFinal != null) {
            return vendaDAO.buscarPorIntervalo(dataInicio, dataFinal);
        } else if(dataInicio != null) {
            return vendaDAO.buscarPorDataMinima(dataInicio);
        } else if(dataFinal != null) {
            return vendaDAO.buscarPorDataMaxima(dataFinal);
        } else {
            return vendaDAO.recuperarTodas();
        }
    }
    
    private Date parseData(String dia, String mes, String ano) {
        Date data = null;
        try {
            int d = Integer.parseInt(dia);
            int m = Integer.parseInt(mes);
            int a = Integer.parseInt(ano);
            
            data = new Date(a, m-1, d, 0, 0, 0);
        } catch(Exception e) {
            
        }
        
        return data;
    }
}
