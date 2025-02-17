package aula4;

import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double val, tax, tem, pre;
        System.out.println("Digite o valor da bem: ");
        val = sc.nextDouble();
        System.out.println("Digite o taxa: ");
        tax = sc.nextDouble();
        System.out.println("Digite o tempo de atraso (em anos): ");
        tem = sc.nextDouble();

        pre = val + (val * (tax/100) * tem);
        System.out.println("O valor da prestação em atraso é de: " + String.format("%.2f", pre));
    }
}
