package aula9;

import java.util.Scanner;

public class VotacaoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] candidatos = {"Leão", "Coruja", "Raposa"};
        int[] votos = {0, 0, 0};

        System.out.println("=== Votação para Mascote da Turma ===");
        System.out.println("1 - Leão");
        System.out.println("2 - Coruja");
        System.out.println("3 - Raposa");
        System.out.println("Digite o número do candidato ou 'fim' para encerrar.");

        String entrada = "";

        while (!entrada.equals("fim")) {
            System.out.print("Seu voto: ");
            entrada = sc.nextLine();

            if (entrada.equals("1")) {
                votos[0]++;
            } else if (entrada.equals("2")) {
                votos[1]++;
            } else if (entrada.equals("3")) {
                votos[2]++;
            } else if (!entrada.equals("fim")) {
                System.err.println("Opção inválida.");
            }
        }

        int totalVotos = votos[0] + votos[1] + votos[2];

        System.out.println("\n=== Resultado da Votação ===");
        for (int i = 0; i < candidatos.length; i++) {
            int porcentagem = 0;
            if (totalVotos > 0) {
                porcentagem = (votos[i] * 100) / totalVotos;
            }
            System.out.println(candidatos[i] + ": " + votos[i] + " votos (" + porcentagem + "%)");
        }

        System.out.println("Total de votos: " + totalVotos);

        sc.close();
    }
}
