/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.local;

import java.util.ArrayList;
import model.Cliente;
import persistence.interfaces.IClienteDAO;

/**
 *
 * @author dener
 */
public class ClienteDAO implements IClienteDAO {
    private final DatabaseSingleton db = DatabaseSingleton.getInstance();
    
    
    @Override
    public void adicionarCliente(Cliente cliente) {
        cliente.setCodigo(db.getNextClienteID());
        db.clientes.add(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {
        for(int i=0; i<db.clientes.size(); i++) {
            if(cliente.getCodigo() == db.clientes.get(i).getCodigo()) {
                db.clientes.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public ArrayList<Cliente> recuperarTodos() {
        return db.clientes;
    }

    @Override
    public Cliente buscarPorID(int clienteID) {
        for(Cliente c : db.clientes) {
            if(c.getCodigo() == clienteID) return c;
        }
        return null;
    }
    
}
