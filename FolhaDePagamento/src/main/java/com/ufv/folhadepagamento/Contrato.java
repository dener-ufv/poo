/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufv.folhadepagamento;

/**
 *
 * @author dener
 */
public abstract class Contrato implements ContratoInterface {
    
    protected Funcionario funcionarioContext;

    public Contrato(Funcionario funcionarioContext) {
        this.funcionarioContext = funcionarioContext;
    }

    @Override
    public abstract double calculaSalario(double horasTrabalhadas);

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contrato clone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
