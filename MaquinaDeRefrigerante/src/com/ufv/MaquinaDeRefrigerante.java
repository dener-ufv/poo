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
public class MaquinaDeRefrigerante {
    private final int MAX = 20;
    private final int moedasAceitas[] = {10, 25, 50, 100};
    
    private int saldo = 1000;
    private int credito = 0;
    
    private int quantidadeTipo1 = 0;
    private int quantidadeTipo2 = 0;
    private int quantidadeTipo3 = 0;
    private int quantidadeTipo4 = 0;
    private int quantidadeTipo5 = 0;
    
    public void inserirCredito(Moeda moeda) throws Exception {
        int ok=0;
        for(int val : moedasAceitas) if(moeda.getValue() == val) ok=1;
        if(ok == 0) throw new Exception("Moeda nao aceita");
        this.credito += moeda.getValue();
    }
    
    public int encerrarVenda() {
        int troco = credito;
        credito = 0;
        return troco;
    }
    
    public void escolherRefrigerante(int opcao) throws Exception {
        switch(opcao) {
            case 1:
                if(credito < Refrigerante.TIPO1.getPreco()) throw new Exception("Saldo Insuficiente");
                if(quantidadeTipo1 == 0) throw new Exception("Nao tem deste refrigerante");
                credito -= Refrigerante.TIPO1.getPreco();
                saldo += Refrigerante.TIPO1.getPreco();
                quantidadeTipo1--;
                break;
                
            case 2:
                if(credito < Refrigerante.TIPO2.getPreco()) throw new Exception("Saldo Insuficiente");
                if(quantidadeTipo2== 0) throw new Exception("Nao tem deste refrigerante");
                credito -= Refrigerante.TIPO2.getPreco();
                saldo += Refrigerante.TIPO2.getPreco();
                quantidadeTipo2--;
                break;
                
            case 3:
                if(credito < Refrigerante.TIPO3.getPreco()) throw new Exception("Saldo Insuficiente");
                if(quantidadeTipo3 == 0) throw new Exception("Nao tem deste refrigerante");
                credito -= Refrigerante.TIPO3.getPreco();
                saldo += Refrigerante.TIPO3.getPreco();
                quantidadeTipo3--;
                break;
                
            case 4:
                if(credito < Refrigerante.TIPO4.getPreco()) throw new Exception("Saldo Insuficiente");
                if(quantidadeTipo4 == 0) throw new Exception("Nao tem deste refrigerante");
                credito -= Refrigerante.TIPO4.getPreco();
                saldo += Refrigerante.TIPO4.getPreco();
                quantidadeTipo4--;
                break;
                
            case 5:
                if(credito < Refrigerante.TIPO5.getPreco()) throw new Exception("Saldo Insuficiente");
                if(quantidadeTipo5== 0) throw new Exception("Nao tem deste refrigerante");
                credito -= Refrigerante.TIPO5.getPreco();
                saldo += Refrigerante.TIPO5.getPreco();
                quantidadeTipo5--;
                break;
                
            default:
                throw new Exception("Opcao invalida");
        }
    }
    
    public void adicionarRefrigerante(Refrigerante tipo) throws Exception {
        switch(tipo) {
            case TIPO1:
                if(quantidadeTipo1 == MAX) throw new Exception("Espaco insuficiente na maquina");
                quantidadeTipo1++;
                break;
            
            case TIPO2:
                if(quantidadeTipo2 == MAX) throw new Exception("Espaco insuficiente na maquina");
                quantidadeTipo2++;
                break;
                
            case TIPO3:
                if(quantidadeTipo3 == MAX) throw new Exception("Espaco insuficiente na maquina");
                quantidadeTipo3++;
                break;
                
            case TIPO4:
                if(quantidadeTipo4 == MAX) throw new Exception("Espaco insuficiente na maquina");
                quantidadeTipo4++;
                break;
                
            case TIPO5:
                if(quantidadeTipo5 == MAX) throw new Exception("Espaco insuficiente na maquina");
                quantidadeTipo5++;
                break;
                
            default:
                throw new Exception("Refrigerante nao cadastrado");
        }
    }

    public int getCredito() {
        return this.credito;
    }
}
