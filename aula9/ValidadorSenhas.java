package aula9;

import java.util.Scanner;

public class ValidadorSenhas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------ Bem Vindo ao validador de Senhas ------");
        System.out.println();
        System.out.println("Digite sua senha: ");
        System.out.print("> ");
        String senha = sc.nextLine();

        char[] especial = {'!', '@', '#', '$', '%', '&', '*'};
        String vogais = "aeiouAEIOU";
        boolean temEspecial = false;
        boolean temMaiusculo = false;
        boolean temNumeroPrimo = false;
        boolean semVogais = true;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            //Caracter Especial
            for (int j = 0; j < especial.length; j++) {
                if (c == especial[j]) {
                    temEspecial = true;
                    break;
                }
            }

            // Letra Maiuscula
            if (Character.isUpperCase(c)) {
                temMaiusculo = true;
            }

            //Numero Primo
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num == 2 || num == 3 || num == 5 || num == 7) {
                    temNumeroPrimo = true;
                }
            }

            //Sem vogais
            if (i < senha.length() - 1) {
                char prox = senha.charAt(i + 1);
                if (vogais.indexOf(c) != -1 && c == prox) {
                    semVogais = false;
                    break;
                }
            }
        }

        //saida
        System.out.println("Senha fornecida: " + senha);
        System.out.println();

        if (temMaiusculo == true) {
            System.out.println("Sua senha contêm uma letra maiuscula");
        }else {
            System.out.println("Sua senha não contêm uma letra maiuscula");
        }

        if (temEspecial == true) {
            System.out.println("Sua senha contêm um caractere especial");
        }else {
            System.out.println("Sua senha não contêm um caractere especial");
        }

        if (temNumeroPrimo == true) {
            System.out.println("Sua senha contêm um numero primo");
        }else {
            System.out.println("Sua senha não contêm um numero primo");
        }

        if (semVogais == true) {
            System.out.println("Sua senha não contem vogais repetidas");
        }else {
            System.out.println("Sua senha contêm vogais repetidas");
        }


        if (temMaiusculo == true && temEspecial == true && temNumeroPrimo == true && semVogais == true) {
            System.out.println("\nSua senha esta valida!!!");
        } else {
            System.out.println("\nSua senha não esta valida!!!");
        }


    }
}
