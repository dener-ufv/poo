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
public class Data {
    private final int dia;
    private final int mes;
    private final int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String str = dia + "/" + mes + "/" + ano;
        return str;
    }

    @Override
    protected Object clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
    
    
}
