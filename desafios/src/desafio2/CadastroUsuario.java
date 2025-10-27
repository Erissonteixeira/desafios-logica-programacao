package desafio2;

import java.util.Scanner;

public class CadastroUsuario{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        if (nomeUsuario.isEmpty()
                || nomeUsuario.equalsIgnoreCase("Admin")
                || nomeUsuario.equalsIgnoreCase("Administrador")){

            System.out.println("Usuário inválido.");
        } else{
            System.out.println(nomeUsuario + " cadastrado com sucesso!");
        }
        scanner.close();
    }
}
