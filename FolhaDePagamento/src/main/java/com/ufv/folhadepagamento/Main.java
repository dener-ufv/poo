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
public class Main {
    public static void main(String[] args) {
        
        Funcionario f1, f2, f3;
        f1 = new Funcionario("Renan", new Data(07, 07, 2007), 1);
        f2 = new Funcionario("Joao", new Data(01, 01, 2001), 2);
        f3 = new Funcionario("Joaquim", new Data(03, 03, 2003), 3);
        
        f1.contratarEfetivo(1000, new Data(10, 10, 2010));
        f2.contratarHorista(2000, new Data(10, 10, 2010));
        f3.contratarEfetivo(3000, new Data(10, 10, 2010));
        
        
        FolhaDePagamento fp = new FolhaDePagamento(f1);
        System.out.println(fp.toString());
        
        fp = new FolhaDePagamento(f2, 100);
        System.out.println(fp.toString());
        
        fp = new FolhaDePagamento(f3, 200);
        System.out.println(fp.toString());
    }
}
