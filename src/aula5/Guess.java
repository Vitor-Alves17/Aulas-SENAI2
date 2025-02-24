package aula5;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        double guess, random;
        boolean guessed = false;
        random = rand.nextDouble(11);
        System.out.println("Vamos jogar um jogo e adivinhação? ");
        System.out.println("Tente adivinhar um número de 0 a 10 ");
        guess = sc.nextDouble();


        while (guessed == false) {
            if (guess != random) {
                System.out.print("Errou!");
                guess = sc.nextDouble();
            }else {
                System.out.println("Acertou!!!");
                guessed = true;
            }
        }
    }
}
