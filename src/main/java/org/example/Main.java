package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        ArrayList<String> extrato = new ArrayList<>();
        int opcao = 0;

        System.out.println("=== CAIXA ELETRÔNICO ===");

        while (opcao != 5) {

            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver extrato");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {

                System.out.println("Saldo atual: R$ " + saldo);

            } else if (opcao == 2) {

                System.out.print("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();

                if (deposito > 0) {
                    saldo += deposito;
                    extrato.add("Depósito de R$ " + deposito);
                    System.out.println("Depósito realizado!");
                } else {
                    System.out.println("Valor inválido!");
                }

            } else if (opcao == 3) {

                System.out.print("Digite o valor do saque: ");
                double saque = scanner.nextDouble();

                if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else if (saque <= 0) {
                    System.out.println("Valor inválido!");
                } else {
                    saldo -= saque;
                    extrato.add("Saque de R$ " + saque);
                    System.out.println("Saque realizado!");
                }

            } else if (opcao == 4) {

                System.out.println("\n=== EXTRATO ===");

                if (extrato.isEmpty()) {
                    System.out.println("Nenhuma movimentação.");
                } else {
                    for (String movimentacao : extrato) {
                        System.out.println(movimentacao);
                    }
                }

            } else if (opcao == 5) {

                System.out.println("Encerrando...");

            } else {

                System.out.println("Opção inválida!");

            }
        }

        scanner.close();
    }
}
