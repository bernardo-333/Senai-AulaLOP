package Aula9;

import java.util.Scanner;

public class CofrinhoInteligente {
    double total = 0;

    public void Colocar() {
        Scanner sc = new Scanner(System.in);
        double[] Moedas = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
        int[] quantidades = new int[Moedas.length];

        for (int i = 0; i < Moedas.length; i++) {
            System.out.printf("Quantas moedas de R$%.2f?",Moedas[i]);
            quantidades[i] = sc.nextInt();
            total += quantidades[i] * Moedas[i];
        }

        System.out.printf("\nTotal de moedas: R$%.2f" , total);
        System.out.println();

        double falta = 100 - total;
        System.out.printf("Falta R$%.2f" , falta , " Reais");


        System.out.println();
        int semanas = (int) ((falta / total)-1);
        if ((falta / total) > semanas) {
            semanas++;
        }
        if (semanas > 0) {
            System.out.println("Se você repetir esse depósito toda semana, vai demorar aproximadamente mais " +
                   semanas + " semana(s) para ajuntar R$ 100,00.");
        } else if (semanas <= 0) {
            System.out.println("Nao tem dinheiro");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CofrinhoInteligente cl = new CofrinhoInteligente();

        while (true) {
            System.out.println("----- Bem Vindo ao Cofrinho -----");
            System.out.println();
            System.out.println("1- Colocar moedas");
            System.out.println("2- Tirar Moedas");
            System.out.println("3- Consultar Saldo");
            System.out.println("4- Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                cl.Colocar();
            } else if (opcao == 2) {
                System.out.println("\nQuer tirar quantos reais?");
                double tirar = sc.nextDouble();
                tirar -= cl.total;
            } else if (opcao == 3) {
                System.out.printf("\nEste é o seu saldo atual: R$%.2f", cl.total);
            } else if (opcao == 4) {
                System.out.println("\nVoce esta saindo");
                break;
            }

        }
    }
}
