package aula9;

import java.util.Random;
import java.util.Scanner;

public class JogoPedra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Bem vindo ao Jogo de Pedra, Papel, Tesoura, Lagarto e Spock");
        System.out.println();
        System.out.println("Escolha uma das opções abaixo:");

        String[] jogo = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock" };

        int num = 0;
        for (int i = 0; i < jogo.length; i++) {
            System.out.println(i + "- " + jogo[i]);
        }
        int opcao;
        System.out.print("\n> ");
        opcao = sc.nextInt();

        int maquina = rd.nextInt(jogo.length);

        if (opcao == maquina) {
            System.out.println("Deu Empate");
        } else if (
                (opcao == 2 && (maquina == 1 || maquina == 3)) ||
                        (opcao == 1 && (maquina == 0 || maquina == 4)) ||
                        (opcao == 0 && (maquina == 3 || maquina == 2)) ||
                        (opcao == 3 && (maquina == 4 || maquina == 1)) ||
                        (opcao == 4 && (maquina == 2 || maquina == 0))
        ) {
            System.out.println("Voce ganhou!!");
        } else {
            System.out.println("A maquina ganhou!!");
        }

        System.out.println();
        System.out.println("Voce escolheu: " + jogo[opcao]);
        System.out.println("A maquina escolheu: " + jogo[maquina]);

    }
}
