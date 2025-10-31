package desafio5;

import java.util.Scanner;

public class MenuSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        double saldo = 0;

        while (opcao != 3){
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Calcular imposto");
            System.out.println("2 - Depositar salário");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.print("Digite o valor do salário: ");
                double salario = scanner.nextDouble();

                double imposto;
                if(salario <= 2000){
                    imposto = 0;
                } else if(salario <= 5000) {
                    imposto = salario * 0.10;
                } else{
                    imposto = salario * 0.20;
                }

                System.out.println("Imposto calculado: R$ " + imposto);
                System.out.println();

            } else if(opcao == 2){
                System.out.print("Digite o valor do depósito: ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado! Saldo atual: R$ " + saldo);
                System.out.println();

            } else if(opcao == 3){
                System.out.println("Saindo... até logo!");

            } else{
                System.out.println("Opção inválida! Tente novamente.");
                System.out.println();
            }
        }
        scanner.close();
    }
}
