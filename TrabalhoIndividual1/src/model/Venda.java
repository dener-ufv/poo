/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dener
 */
public class Venda {
    int codigo;
    int clienteID;
    String data;
    Status status;
    ArrayList<Integer> itemIDs;

    public Venda(int clienteID, String data) {
        this.clienteID = clienteID;
        this.data = data;
        this.status = Status.PENDENTE;
        this.itemIDs = new ArrayList<>();
    }
    
    public void adicionarItem(int itemID) {
        this.itemIDs.add(itemID);
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void vendaPendente() {
        this.status = Status.PENDENTE;
    }
    
    public void vendaEmAndamento() {
        this.status = Status.EM_ANDAMENTO;
    }
    
    public void vendaEntregue() {
        this.status = Status.ENTREGUE;
    }
    
    private enum Status {
        PENDENTE, EM_ANDAMENTO, ENTREGUE;
    };
}
