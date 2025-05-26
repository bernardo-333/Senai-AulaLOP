package Aula9;

import java.util.Scanner;

public class BuscaFeiticos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] feitico = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
        String[] num = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};

        while (true) {
            System.out.println("\n------ Busca Binária no Mundo dos Feitiços ------");

            System.out.println("Aceleratio, "+ "Defensio, "+ "Expelliarmus, "+ "Lumos, "+ "Wingardium Leviosa");
            System.out.println("\nQual feiticio você quer achar:");

            while (true) {
                System.out.print("> ");
                String opcao = sc.nextLine();
                if (opcao.equalsIgnoreCase("Aceleratio")) {
                    System.out.println(feitico[0] + " é o " + num[0] + " da lista");
                    break;
                } else if (opcao.equalsIgnoreCase("Defensio")) {
                    System.out.println(feitico[1] + " é o " + num[1] + " da lista");
                    break;
                } else if (opcao.equalsIgnoreCase("Expelliarmus")) {
                    System.out.println(feitico[2] + " é o " + num[2] + " da lista");
                    break;
                } else if (opcao.equalsIgnoreCase("Lumos")) {
                    System.out.println(feitico[3] + " é o " + num[3] + " da lista");
                    break;
                } else if (opcao.equalsIgnoreCase("Wingardium Leviosa")) {
                    System.out.println(feitico[4] + " é o " + num[4] + " da lista");
                    break;
                } else {
                    System.err.println("Opção invalida, tente novamente:");
                }
            }
        }

    }
}
