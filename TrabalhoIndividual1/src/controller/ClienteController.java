/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
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
    
    public boolean criarCliente(String nome, String cpf, String email, String senha, String endereco) {
        if(nome == null || cpf == null || email == null || senha == null || endereco == null) return false;
        if(nome.length() == 0 || !validateCPF(cpf) || email.length() == 0 || senha.length() == 0 || endereco.length() == 0) return false;
        Cliente c = new Cliente(cpf, nome, email, senha, endereco);
        clienteDAO.adicionarCliente(c);
        return true;
    }
    
    public boolean editarCliente(int clienteID, String nome, String cpf, String email, String senha) {
        return false;
    }
    
    public boolean adicionarEndereco(int clienteID, String endereco) {
        if(endereco == null || endereco.length() == 0) return false;
        Cliente cliente = clienteDAO.buscarPorID(clienteID);
        
        clienteDAO.editarCliente(cliente);
        return true;
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
