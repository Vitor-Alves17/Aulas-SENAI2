package Aula10.Cofre;

import java.util.Scanner;

public class CalcCofre {
    public static double soma;

    public static void Soma() {
        Scanner sc = new Scanner(System.in);

        double[][] moedas = {{0.01, 0.05, 0.10, 0.25, 0.50, 1.00}, {0, 0, 0, 0, 0, 0}};
        double[] multi = new double[moedas[0].length];
        String ver = "s";
        soma = 0;
        double sug = 0;


        while (ver.equals("s")) {
            for (int i = 0; i < moedas[0].length; i++) {
                System.out.println("Quantas moedas de R$" + moedas[0][i] + " deseja inserir? ");
                double valor = sc.nextDouble();
                moedas[1][i] = valor;
            }
            for (int i = 0; i < moedas[0].length; i++) {
                multi[i] = moedas[0][i] * moedas[1][i];
                soma += multi[i];
            }
            System.out.println("Ao todo, nessa semana, o valor acumulado no cofrinho é de: R$" + String.format("%.2f", soma));
            System.out.println("Para alcançar R$100 você pode usar aproximadamente mais ");
            for (int i = 0; i < moedas[0].length; i++) {
                sug = (100 - soma) / moedas[0][i];
                System.out.println(Math.ceil(sug) + " moedas de R$" + String.format("%.2f", moedas[0][i]));
                if(i < 5){
                    System.out.print(" ou ");
                }else {
                    System.out.println("");
                }
            }
            System.out.println("Deseja odicionar adicionar as moedas dessa semana? (s para sim/ qualquer outro digito para não): ");
            ver = sc.next();
        }
        System.out.println("Se você inserir esse mesmo valor toda semana, em " + Math.ceil(100 / soma - soma) + " semanas você alcança o valor de R$" + 100.00);
    }
}