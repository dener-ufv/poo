/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufv;

/**
 *
 * @author dener
 */
public enum Moeda {
    CINCO_CENTAVOS(5), DEZ_CENTAVOS(10), VINTE_E_CINCO_CENTAVOS(25), CINQUENTA_CENTAVOS(50), UM_REAL(100);
    
    private final int value;
    
    private Moeda(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
