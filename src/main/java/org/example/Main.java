package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        int opcao = 0;

        System.out.println("=== CAIXA ELETRÔNICO ===");

        while (opcao != 4) {

            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                int saque = scanner.nextInt();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                }

            } else if (opcao == 2) {
                System.out.println("Digite o deposito:");
                int deposito = scanner.nextInt();
                if (deposito <= 0) {
                    System.out.println("Valor inválido!");
                } else {
                    saldo += deposito;
                }

            } else if (opcao == 3) {
                System.out.println("Digite o saldo:");
                int saque = scanner.nextInt();
                saldo-=saque;
                System.out.println("Saque feito");

            } else if (opcao == 4) {
                System.out.println("Saldo atual: R$ " + saldo);
                break;

            } else {
                System.out.println("opção invalida");
            }
        }

        scanner.close();
    }
}
