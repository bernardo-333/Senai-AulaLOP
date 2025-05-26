package Aula9;

import java.util.Scanner;

public class SuperHerois {
    double[] batman = {7, 7, 10};
    double[] superman = {10, 8, 9};
    double[] flash = {6, 8, 10};
    double[] Personagem = {0, 0, 0};

    double poderBatman = (batman[0] + batman[1] + batman[2]) / 3;
    double poderSuperman = (superman[0] + superman[1] + superman[2]) / 3;
    double poderFlash = (flash[0] + flash[1] + flash[2]) / 3;
    double poderPersonagem = 0;
    double usuario = 0;

    String escolha;

    public void MostrarHerois() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ Mostrar heróis disponíveis ------");
        System.out.println();
        System.out.printf("| %-3s | %-9s | %-5s | %-12s | %-9s |\n", "Nº", "HEROI", "FORÇA", "INTELIGÊNCIA", "AGILIDADE");
        System.out.printf("| %-3d | %-9s | %-5.1f | %-12.1f | %-9.1f |\n", 1, "Batman", batman[0], batman[1], batman[2]);
        System.out.printf("| %-3d | %-9s | %-5.1f | %-12.1f | %-9.1f |\n", 2, "Superman", superman[0], superman[1], superman[2]);
        System.out.printf("| %-3d | %-9s | %-5.1f | %-12.1f | %-9.1f |\n", 3, "Flash", flash[0], flash[1], flash[2]);
        System.out.printf("| %-3d | %-9s | %-5.1f | %-12.1f | %-9.1f |\n", 3, "Seu Heroi", Personagem[0], Personagem[1], Personagem[2]);

            System.out.println("Escolha um herói ou digite 'voltar' para voltar ao menu principal:");
            System.out.print("> ");
            escolha = sc.nextLine();

            if (escolha.equals("1")) {
                usuario = poderBatman;
                System.out.println("Você escolheu o Batman!!");
            } else if (escolha.equals("2")) {
                usuario = poderSuperman;
                System.out.println("Você escolheu o Superman!!");
            } else if (escolha.equals("3")) {
                usuario = poderFlash;
                System.out.println("Você escolheu o Flash!!");
            }
    }

    public void CriarHeroi() {
        Scanner sc = new Scanner(System.in);
        String[] atributos = {"Força", "Inteligência", "Agilidade"};

        System.out.println("\n------ Criação do Heroi ------");

        for (int i = 0; i < 3; i++) {
            System.out.print("Escolha a " + atributos[i] + " (1 a 10): \n> ");
            double valor = sc.nextDouble();

            while (valor < 1 || valor > 10) {
                System.err.print("Valor inválido. Digite novamente (1 a 10): \n> ");
                valor = sc.nextDouble();
            }

            Personagem[i] = valor;
        }

        System.out.println("\n=== Herói Criado ===");
        System.out.println("Força: " + Personagem[0]);
        System.out.println("Inteligência: " + Personagem[1]);
        System.out.println("Agilidade: " + Personagem[2]);
        poderPersonagem = (Personagem[0] + Personagem[1] + Personagem[2]) / 3;
        usuario = poderPersonagem;
    }

    public void LutarBatman() {
        System.out.println("Seu poder: " + usuario + "\nPoder da máquina: " + poderBatman);
        if (usuario > poderBatman) {
            System.out.println("Você ganhou!!!");
        } else if (usuario == poderBatman){
            System.out.println("Deu empate!!!");
        } else {
            System.out.println("Você perdeu :(");
        }
    }

    public void LutarSuperman() {
        System.out.println("Seu poder: " + usuario + "\nPoder da máquina: " + poderSuperman);
        if (usuario > poderSuperman) {
            System.out.println("Você ganhou!!!");
        } else if (usuario == poderSuperman){
            System.out.println("Deu empate!!!");
        } else {
            System.out.println("Você perdeu :(");
        }
    }

    public void LutarFlash() {
        System.out.println("Seu poder: " + usuario + "\nPoder da máquina: " + poderFlash);
        if (usuario > poderFlash) {
            System.out.println("Você ganhou!!!");
        } else if (usuario == poderFlash){
            System.out.println("Deu empate!!!");
        } else {
            System.out.println("Você perdeu :(");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SuperHerois cl = new SuperHerois();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n------ Menu Principal ------");
            System.out.println("1. Mostrar heróis disponíveis");
            System.out.println("2. Criar um novo herói");
            System.out.println("3. Sair");
            System.out.print("> ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                cl.MostrarHerois();
                if (cl.escolha.equalsIgnoreCase("voltar")) {
                    System.out.println("Voltando ao menu principal...");
                    continue;
                }
            } else if (opcao == 2) {
                cl.CriarHeroi();
            }
            else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                continuar = false;
            }

            System.out.println("\n------ Lute Agora ------");
            System.out.println("1. Batman");
            System.out.println("2. Superman");
            System.out.println("3. Flash");

            int opcao2;
            while (true) {
                System.out.print("> ");
                opcao2 = sc.nextInt();
                sc.nextLine();

                if (opcao2 == 1) {
                    cl.LutarBatman();
                    break;
                } else if (opcao2 == 2) {
                    cl.LutarSuperman();
                    break;
                } else if (opcao2 == 3) {
                    cl.LutarFlash();
                    break;
                } else {
                    System.err.println("Opção inválida, tente novamente.");
                }
            }
        }
        sc.close();
    }
}
