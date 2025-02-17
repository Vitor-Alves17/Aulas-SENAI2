package aula4;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;
        System.out.print("Me dê o valor em aula4.Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("aula4.Celsius: " + String.format("%.2f", celsius));
    }
}
