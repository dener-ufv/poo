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
public interface ContratoInterface {
    
    public double calculaSalario(double horasTrabalhadas);
    
    public Contrato clone();
    
}
