package br.com.senai;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-Vindo a TechSys");

        do {
            System.out.println("""
                    1 - Cadastrar
                    2 - Listar Pessoas
                    3 - Listar Contas
                    4 - Editar Pessoa
                    0 - Sair""");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    input.nextLine();
                    System.out.print("Digite o nome da Pessoa: ");
                    String nome = input.nextLine();
                    System.out.print("Digite o CPF da Pessoa: ");
                    String cpf = input.nextLine();
                    Funcoes.cadastrar(nome, cpf);

                    System.out.print("Digite o Número da conta: ");
                    int numeroDaConta = input.nextInt();
                    System.out.print("Digite a Agência da conta: ");
                    int agencia = input.nextInt();
                    input.nextLine();
                    System.out.print("Digite a Data de Abertura da conta: ");
                    String dataDeAberturaDaConta = input.nextLine();
                    System.out.print("Digite o Saldo em conta: ");
                    double saldoEmConta = input.nextInt();
                    Funcoes.cadastrarConta(numeroDaConta, agencia, dataDeAberturaDaConta, saldoEmConta);

                    break;
                case 2:
                    Funcoes.listarPessoas();
                    break;
                case 3:
                    Funcoes.listarContas();
                    break;
                case 4:
                    input.nextLine();
                    System.out.print("Digite o CPF da Pessoa: ");
                    cpf = input.nextLine();
                    Funcoes.editarPessoa(cpf);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (true);
    }
}
