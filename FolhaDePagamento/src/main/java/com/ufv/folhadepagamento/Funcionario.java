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
public class Funcionario {
    private final String nome;
    private final Data dataDeNascimento;
    private int filhosMenores;
    private Contrato contrato;
    private double salario;
    private Data dataDeAdimissao;
    
    public Funcionario(String nome, Data dataDeNascimento, int filhosMenores) {
        this.nome = nome;
        this.dataDeNascimento = (Data) dataDeNascimento.clone();
        this.filhosMenores = filhosMenores;
    }

    public String getNome() {
        return nome;
    }

    public Data getDataDeNascimento() {
        return (Data) dataDeNascimento.clone();
    }

    public Contrato getContrato() {
        return (Contrato) this.contrato.clone();
    }

    public int getFilhosMenores() {
        return filhosMenores;
    }

    public double getSalario() {
        return salario;
    }

    public Data getDataDeAdimissao() {
        return (Data) dataDeAdimissao.clone();
    }

    public void setContrato(Contrato contrato) {
        this.contrato = (Contrato) contrato.clone();
    }

    public void setFilhosMenores(int filhosMenores) {
        this.filhosMenores = filhosMenores;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataDeAdimissao(Data dataDeAdimissao) {
        this.dataDeAdimissao = (Data) dataDeAdimissao.clone();
    }
    
}
