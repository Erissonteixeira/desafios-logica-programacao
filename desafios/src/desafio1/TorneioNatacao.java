package desafio1;

import java.util.Scanner;

public class TorneioNatacao{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do participante: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do participante: ");
        int idade = scanner.nextInt();

        String categoria;
        if (idade < 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 15) {
            categoria = "Juvenil";
        } else if (idade >= 16 && idade <= 19) {
            categoria = "Pré-adulto";
        } else {
            categoria = "Adulto";
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Categoria: " + categoria);

        scanner.close();
    }
}

