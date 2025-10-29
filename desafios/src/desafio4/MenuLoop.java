package desafio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuLoop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0){
            System.out.println();
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Mostrar status do carro");
            System.out.println("2 - Acelerar (simulação)");
            System.out.println("3 - Frear (simulação)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
                opcao = -1;
                continue;
            }
            switch (opcao){
                case 1:
                    System.out.println("Status: Carro ligado, marchas OK.");
                    break;
                case 2:
                    System.out.println("Acelerando... (simulação)");
                    break;
                case 3:
                    System.out.println("Freando... (simulação)");
                    break;
                case 0:
                    System.out.println("Saindo... até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
