package br.com.senai.entity;

public class Pessoa {
    String nome;
    String cpf;

    private ContaCorrente contaCorrente;

    private ContaPoupanca contaPoupanca;

    private ContaSalario contaSalario;

    public Pessoa() {}

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaSalario getContaSalario() {
        return contaSalario;
    }

    public void setContaSalario(ContaSalario contaSalario) {
        this.contaSalario = contaSalario;
    }
}
