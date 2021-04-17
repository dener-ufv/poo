/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.entities.Cliente;
import persistence.interfaces.IClienteDAO;

/**
 *
 * @author dener
 */
public class ClienteController {
    private IClienteDAO clienteDAO;

    public ClienteController(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    public boolean criarCliente(String nome, String cpf, String email, String senha) {
        if(nome == null || cpf == null || email == null || senha == null) return false;
        if(nome.length() == 0 || !validateCPF(cpf) || email.length() == 0 || senha.length() == 0) return false;
        if(clienteDAO.buscarPorCPF(cpf) != null) return false;
        if(clienteDAO.buscarPorEmail(email) != null) return false;
        Cliente cliente = new Cliente(cpf, nome, email, senha);
        clienteDAO.adicionarCliente(cliente);
        return true;
    }
    
    public boolean editarCliente(int clienteID, String nome, String cpf, String email, String senha) {
        return false;
    }
    
    public ArrayList<Cliente> recuperarTodos() {
        return clienteDAO.recuperarTodos();
    }
    
    private boolean validateCPF(String cpf) {
        if(cpf.length() != 11) return false;
        String digits = "0123456789";
        for(int i=0; i<cpf.length(); i++) {
            boolean ok = false;
            for(int j=0; j<digits.length(); j++) {
                if(cpf.charAt(i) == digits.charAt(j)) {
                    ok = true;
                    break;
                }
            }
            if(!ok) return false;
        }
        
        return true;
    }
}
