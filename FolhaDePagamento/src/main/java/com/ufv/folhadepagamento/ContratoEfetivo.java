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
public class ContratoEfetivo extends Contrato {

    public ContratoEfetivo(Funcionario funcionarioContext) {
        super(funcionarioContext);
    }

    @Override
    public double calculaSalario(double horasTrabalhadas) {
        return super.funcionarioContext.getSalario();
    }

    @Override
    public String toString() {
        return "Efetivo";
    }

    @Override
    public Contrato clone() {
        return new ContratoEfetivo(this.funcionarioContext);
    }
    
    
}
