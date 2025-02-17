package aula4;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit, celsius;
        System.out.print("Me dê um valor em celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("aula4.Fahrenheit: " + fahrenheit);

    }
}
