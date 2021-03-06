/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence.interfaces;

import java.util.ArrayList;
import model.entities.Cliente;

/**
 *
 * @author dener
 */
public interface IClienteDAO {
    void adicionarCliente(Cliente cliente);
    void editarCliente(Cliente cliente);
    Cliente buscarPorID(int clienteID);
    Cliente buscarPorCPF(String cpf);
    Cliente buscarPorEmail(String email);
    ArrayList<Cliente> recuperarTodos();
}
