package Aula10.Cofre;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcCofre {
    Scanner sc = new Scanner(System.in);
    public static void Soma(){
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        double[][] moedas = {{0.01, 0.05, 0.10, 0.25, 0.50, 1.00}, {0, 0, 0, 0, 0, 0}};
        for(int i = 0; i < 5; i++){
            moedas[1][i] = sc.nextDouble();
        }


    }
}
