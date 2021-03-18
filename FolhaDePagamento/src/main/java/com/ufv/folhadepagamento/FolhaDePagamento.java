/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufv.folhadepagamento;

import java.text.DecimalFormat;

/**
 *
 * @author dener
 */
public class FolhaDePagamento {
    
    private Funcionario funcionario;
    private double horasTrabalhadas;

    public FolhaDePagamento(Funcionario funcionario, double horasTrabalhadas) {
        this.funcionario = funcionario;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public FolhaDePagamento(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.horasTrabalhadas = 0;
    }
    
    private double calculaSalarioBruto() {
        return this.funcionario.getContrato().calculaSalario(this.horasTrabalhadas);
    }
    
    private double calculaDescontoInss() {
        double salarioBruto = this.calculaSalarioBruto();
        
        if(salarioBruto <= 1659.38) return salarioBruto * 0.08;
        else if(salarioBruto <= 2765.66) return salarioBruto * 0.09;
        else return Math.min(salarioBruto, 5531.31) * 0.11;
    }
    
    private double calculaImpostoDeRenda() {
        double salarioBruto = this.calculaSalarioBruto();
        double inss = this.calculaDescontoInss();
        double diferenca = salarioBruto - inss;
        if(diferenca <= 1903.98) return 0;
        else if(diferenca <= 2826.65) return (diferenca) * 0.075 - 142.80;
        else if(diferenca <= 3751.05) return (diferenca) * 0.15 - 354.80;
        else if(diferenca <= 4664.68) return (diferenca) * 0.225 - 636.13;
        else return (salarioBruto - inss) * 0.275 - 869.36;
    }
    
    private double calculaSalarioLiquido() {
        return this.calculaSalarioBruto() - this.calculaDescontoInss() - this.calculaImpostoDeRenda();
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.##");
        
        String s = "FOLHA DE PAGAMENTO\n" + 
                "Nome do Funcionario: " + this.funcionario.getNome() + "\n" + 
                "Data de Nascimeto: " + this.funcionario.getDataDeNascimento().toString() + "\n" +
                "Tipo de Contrato: " + this.funcionario.getContrato().toString() + "\n" + 
                "Quantidade de Filhos Menores: " + this.funcionario.getFilhosMenores() + "\n" +
                "Salario Bruto: " + formatter.format(this.calculaSalarioBruto()) + "\n" + 
                "Desconto do INSS: " + formatter.format(this.calculaDescontoInss()) + "\n" + 
                "Desconto do Imposto de Renda: " + formatter.format(this.calculaImpostoDeRenda()) + "\n" + 
                "Salario Liquido: " + formatter.format(this.calculaSalarioLiquido()) + "\n\n";
        return s;
    }
    
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
