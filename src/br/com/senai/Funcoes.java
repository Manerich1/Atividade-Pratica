package br.com.senai;

import br.com.senai.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    static Scanner input = new Scanner(System.in);
    private static List<Pessoa> pessoas = new ArrayList<>();
    private static List<Conta> contas = new ArrayList<>();

    public static void cadastrar(String nome, String cpf) {
        pessoas.add(new Pessoa(nome, cpf));
    }

    public static void cadastrarConta(int numeroDaConta, int agencia, String dataDeAberturaDaConta, double saldoEmConta) {

        boolean continuar = true;
        while (continuar) {
            System.out.println("""
                    Escolha qual o tipo de Conta
                    1 - Conta Corrente
                    2 - Conta Poupanca
                    3 - Conta Salario""");
            int tipoDeConta = input.nextInt();

            Conta conta = null;
            switch (tipoDeConta) {
                case 1:
                    conta = new ContaCorrente(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
                    continuar = false;
                    break;
                case 2:
                    conta = new ContaPoupanca(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
                    continuar = false;
                    break;
                case 3:
                    conta = new ContaSalario(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);
                    continuar = false;
                    break;
                default:
                    System.out.println("Tente novamente!");
            }
            contas.add(conta);
        }
    }

    public static void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("-------------------");
        }
    }

    public static void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Número da Conta: " + conta.getNumeroDaConta());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Data de Abertura da Conta: " + conta.getDataDeAberturaDaConta());
            System.out.println("Saldo em Conta: " + conta.getSaldoEmConta());
            System.out.println("-------------------");
        }
    }

    public static void editarPessoa(String cpf) {
        input.nextLine();
        System.out.print("Digite o novo nome da Pessoa: ");
        String nome = input.nextLine();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                pessoa.setNome(nome);
            }
        }
    }
}
