package desafio3;

import java.util.Scanner;

public class AlistamentoMilitar{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.next().toUpperCase();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if(sexo.equals("M")){
            if(idade >= 18){
                System.out.println("Alistamento obrigatório.");
            } else{
                System.out.println("Alistamento não permitido.");
            }
        } else if(sexo.equals("F")){
            if (idade >= 18){
                System.out.print("Deseja se alistar? (S/N): ");
                String resposta = scanner.next().toUpperCase();

                if(resposta.equals("S")){
                    System.out.println("Alistamento voluntário confirmado.");
                } else{
                    System.out.println("Alistamento não realizado.");
                }
            } else{
                System.out.println("Alistamento não permitido.");
            }
        } else{
            System.out.println("Sexo inválido. Digite apenas M ou F.");
        }
        scanner.close();
    }
}
