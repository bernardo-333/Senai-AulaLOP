package Aula9;

import java.util.Scanner;

public class IlhaCodigosPerdidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos códigos deseja digitar? ");
        int quantidadeCodigos = scanner.nextInt();
        scanner.nextLine();

        String[] codigos = new String[quantidadeCodigos];

        for (int i = 0; i < quantidadeCodigos; i++) {
            System.out.print("Digite o código " + (i + 1) + ": ");
            codigos[i] = scanner.nextLine();
        }

        String resultado = "";

        for (int i = 0; i < codigos.length; i++) {
            String codigo = codigos[i];

            int quantidade = codigo.charAt(0) - '0';
            char letra = codigo.charAt(1);

            for (int j = 0; j < quantidade; j++) {
                resultado = resultado + letra;
            }
        }

        System.out.println("Código reconstruído: " + resultado);

        scanner.close();
    }
}
