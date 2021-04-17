/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.dao;

import java.util.ArrayList;
import model.entities.Cliente;
import persistence.interfaces.IClienteDAO;
import persistence.local.DatabaseSingleton;

/**
 *
 * @author dener
 */ 
public class ClienteDAO implements IClienteDAO {
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    private static int clienteID = 1;
    
    @Override
    public void adicionarCliente(Cliente cliente) {
        cliente.setClienteID(clienteID++);
        db.clientes.add(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {
        for(int i=0; i<db.clientes.size(); i++) {
            Cliente c = db.clientes.get(i);
            if(c.getClienteID() == cliente.getClienteID()) {
                db.clientes.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public Cliente buscarPorID(int clienteID) {
        for(Cliente c : db.clientes) {
            if(c.getClienteID() == clienteID) return c;
        }
        return null;
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        for(Cliente c : db.clientes) {
            if(c.getCpf().equals(cpf)) return c;
        }
        return null;
    }

    @Override
    public Cliente buscarPorEmail(String email) {
        for(Cliente c : db.clientes) {
            if(c.getEmail().equals(email)) return c;
        }
        return null;
    }
    
    @Override
    public ArrayList<Cliente> recuperarTodos() {
        return db.clientes;
    }
}
