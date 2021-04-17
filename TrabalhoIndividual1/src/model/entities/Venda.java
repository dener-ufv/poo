/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dener
 */
public class Venda {
    private int vendaID;
    private Cliente cliente;
    private Endereco endereco;
    private Date data;
    private StatusDaVenda status;
    private ArrayList<QuantidadeDeProduto> items;

    public Venda(Cliente cliente, Endereco endereco, Date data, ArrayList<QuantidadeDeProduto> items) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.data = data;
        this.status = StatusDaVenda.PENDENTE;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Date getData() {
        return data;
    }

    public StatusDaVenda getStatus() {
        return status;
    }

    public ArrayList<QuantidadeDeProduto> getItems() {
        return items;
    }

    public int getVendaID() {
        return vendaID;
    }

    public void setVendaID(int vendaID) {
        this.vendaID = vendaID;
    }
    
    public void vendaPendente() {
        this.status = StatusDaVenda.PENDENTE;
    }
    
    public void vendaEmAndamento() {
        this.status = StatusDaVenda.EM_ANDAMENTO;
    }
    
    public void vendaEntregue() {
        this.status = StatusDaVenda.ENTREGUE;
    }
}
