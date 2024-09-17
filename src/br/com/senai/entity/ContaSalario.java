package br.com.senai.entity;

public class ContaSalario extends Conta {
    private final int taxaDeManutencao = 10;

    public ContaSalario() {}

    public ContaSalario(int numeroDaConta, int agencia, String dataDeAberturaDaConta, double saldoEmConta) {
        super(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
    }

    public int getTaxaDeManutencao() {
        return taxaDeManutencao;
    }
}
