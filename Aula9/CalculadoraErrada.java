package aula9;
        import java.util.Scanner;
import java.util.Random;

        public class CalculadoraErrada {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random rd = new Random();

                System.out.println("\n------ Calculadora Errada ------");

                System.out.print("Quantos cálculos deseja fazer? ");
                int quantidade = sc.nextInt();

                double[] num1 = new double[quantidade];
                double[] num2 = new double[quantidade];
                char[] operacoes = new char[quantidade];
                double[] resultadosComErro = new double[quantidade];

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("\nCálculo " + (i + 1) + ":");

                    System.out.print("Digite o primeiro número: ");
                    num1[i] = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    num2[i] = sc.nextDouble();

                    System.out.print("Escolha a operação (+, -, *, /): ");
                    operacoes[i] = sc.next().charAt(0);

                    double resultado = 0;

                    if (operacoes[i] == '+') {
                        resultado = num1[i] + num2[i];
                    } else if (operacoes[i] == '-') {
                        resultado = num1[i] - num2[i];
                    } else if (operacoes[i] == '*') {
                        resultado = num1[i] * num2[i];
                    } else if (operacoes[i] == '/') {
                        if (num2[i] != 0) {
                            resultado = num1[i] / num2[i];
                        } else {
                            System.out.println("Erro: divisão por zero! O resultado será considerado como 0.");
                            resultado = 0;
                        }
                    } else {
                        System.out.println("Operação inválida! O resultado será considerado como 0.");
                        resultado = 0;
                    }

                    double erroPercentual = -0.01 + (0.02 * rd.nextDouble());
                    resultadosComErro[i] = resultado + (resultado * erroPercentual);
                }

                System.out.println("\nResultados com erro:");

                for (int i = 0; i < quantidade; i++) {
                    System.out.printf("Cálculo %d: %.2f %c %.2f = %.4f (com erro)%n",
                            (i + 1), num1[i], operacoes[i], num2[i], resultadosComErro[i]);
                }

                sc.close();
            }
        }



