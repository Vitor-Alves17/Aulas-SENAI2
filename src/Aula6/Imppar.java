package Aula6;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Imppar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Digite um valor: ");
        num = sc.nextDouble();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println(num + " é par");
            } else {
                System.out.println(num + " é impar");
            }
            System.out.println("Digite outro valor: ");
            num = sc.nextDouble();
        }
    }
}
