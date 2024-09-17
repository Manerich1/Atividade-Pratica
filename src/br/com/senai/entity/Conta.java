package br.com.senai.entity;

public class Conta {
    private int numeroDaConta;
    private int agencia;
    private String dataDeAberturaDaConta;
    private double saldoEmConta;

    public Conta() {}

    public Conta(int NumeroDaConta, int Agencia, String DataDeAberturaDaConta, double SaldoEmConta) {
        this.numeroDaConta = NumeroDaConta;
        this.agencia = Agencia;
        this.dataDeAberturaDaConta = DataDeAberturaDaConta;
        this.saldoEmConta = SaldoEmConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getDataDeAberturaDaConta() {
        return dataDeAberturaDaConta;
    }

    public void setDataDeAberturaDaConta(String dataDeAberturaDaConta) {
        this.dataDeAberturaDaConta = dataDeAberturaDaConta;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }
}
