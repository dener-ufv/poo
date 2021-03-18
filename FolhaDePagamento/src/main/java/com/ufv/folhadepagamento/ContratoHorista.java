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
public class ContratoHorista extends Contrato {

    public ContratoHorista(Funcionario funcionarioContext) {
        super(funcionarioContext);
    }
    
    @Override
    public double calculaSalario(double horasTrabalhadas) {
        return this.funcionarioContext.getSalario() * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Horista";
    }
    
    @Override
    public Contrato clone() {
        return new ContratoHorista(this.funcionarioContext);
    }
    
}
