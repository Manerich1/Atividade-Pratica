package br.com.senai.entity;

public class ContaPoupanca extends Conta {
    private final double rendimento = 0.15; // 15%

    public ContaPoupanca() {}

    public ContaPoupanca(int numeroDaConta, int agencia, String dataDeAberturaDaConta, double saldoEmConta) {
        super(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
    }

    public double getRendimento() {
        return rendimento;
    }
}
