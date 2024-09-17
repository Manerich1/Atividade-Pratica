package br.com.senai.entity;

public class ContaCorrente extends Conta {
    private final int manutencao = 30;

    public ContaCorrente() {}

    public ContaCorrente(int numeroDaConta, int agencia, String dataDeAberturaDaConta, double saldoEmConta) {
        super(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
    }
    public int getManutencao() {
        return manutencao;
    }
}
