package aula4;

import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double altura, largura, cum, volume;
            System.out.println("Digite o altura do caixa: ");
            altura = sc.nextDouble();
            System.out.println("Digite o largura do caixa: ");
            largura = sc.nextDouble();
            System.out.println("Digite o comprimento do caixa: ");
            cum = sc.nextDouble();
            volume = altura * largura * cum;
            System.out.println("O volume da caixa é de: " + String.format("%.2f", volume));
    }
}
