package AulaFiammaGrupo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Conta {
    private String numero;
    private String senha;
    private double saldo;

    public Conta(String numero, String senha, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void atualizarSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}

public class exercicio3 {
    private Map<String, Conta> contas;
    private Scanner scanner;
    private Random random;

    public exercicio3() {
        this.contas = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.random = new Random();

        // Inicializa uma conta de exemplo
        Conta contaExemplo = new Conta("123456", "1234", 1000.0);
        contas.put(contaExemplo.getNumero(), contaExemplo);
    }

    public void iniciar() {
        System.out.println("Bem-vindo ao caixa eletrônico!");

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Criar Conta");
            System.out.println("2. Acessar Conta");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    acessarConta();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private void criarConta() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        String numeroConta = gerarNumeroConta();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o saldo inicial: R$");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); 

        Conta conta = new Conta(numeroConta, senha, saldo);
        contas.put(conta.getNumero(), conta);

        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta: " + numeroConta);
    }

    private String gerarNumeroConta() {
        return String.valueOf(1 + random.nextInt(999999));
    }

    private void acessarConta() {
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        if (!contas.containsKey(numeroConta)) {
            System.out.println("Conta não encontrada. Por favor, tente novamente.");
            return;
        }

        Conta conta = contas.get(numeroConta);

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (!conta.getSenha().equals(senha)) {
            System.out.println("Senha incorreta. Por favor, tente novamente.");
            return;
        }

        menuPrincipal(conta);
    }

    private void menuPrincipal(Conta conta) {
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    consultarSaldo(conta);
                    break;
                case 2:
                    depositar(conta);
                    break;
                case 3:
                    sacar(conta);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private void consultarSaldo(Conta conta) {
        System.out.println("Seu saldo atual é: R$" + conta.getSaldo());
    }

    private void depositar(Conta conta) {
        System.out.print("Digite o valor para depositar: R$");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        if (valor > 0) {
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido. Por favor, tente novamente.");
        }
    }

    private void sacar(Conta conta) {
        System.out.print("Digite o valor para sacar: R$");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 

        if (valor > 0 && conta.getSaldo() >= valor) {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente. Por favor, tente novamente.");
        }
    }

    public static void main(String[] args) {
        exercicio3 caixa = new exercicio3();
        caixa.iniciar();
    }
}