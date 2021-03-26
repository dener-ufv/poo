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
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse sistema de exemplo nao tem uma repeticao para fazer compras");
        System.out.println("mas a ideia eh que um usuario possa ir comprando cada item e quando encerra a compra");
        System.out.println("ele recebe o troco. A cada compra, insercao de moeda ou insercao de refrigerante");
        System.out.println("deve ser tratada uma excessao de valores invalidos. Todos os valores de dinheiro aqui sao salvos");
        System.out.println("em centavos");
        
        MaquinaDeRefrigerante maquina = new MaquinaDeRefrigerante();
        try {
            maquina.adicionarRefrigerante(Refrigerante.TIPO1);
            maquina.adicionarRefrigerante(Refrigerante.TIPO1);
            maquina.adicionarRefrigerante(Refrigerante.TIPO2);
            maquina.adicionarRefrigerante(Refrigerante.TIPO3);
            maquina.adicionarRefrigerante(Refrigerante.TIPO3);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            maquina.inserirCredito(Moeda.UM_REAL);
            maquina.inserirCredito(Moeda.UM_REAL);
            maquina.inserirCredito(Moeda.UM_REAL);
            maquina.inserirCredito(Moeda.UM_REAL);
            maquina.inserirCredito(Moeda.UM_REAL);
            maquina.inserirCredito(Moeda.CINCO_CENTAVOS);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("credito adicionado " + maquina.getCredito());
        
        try {
            maquina.escolherRefrigerante(3);
            maquina.escolherRefrigerante(1);
            maquina.escolherRefrigerante(2);
            maquina.escolherRefrigerante(1);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("credito restante " + maquina.getCredito());
        
        int troco = maquina.encerrarVenda();
        System.out.println("troco " + troco);
    }
}
