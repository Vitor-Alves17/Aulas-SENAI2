package Aula3;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Double pre, quan, pref, rec, troco;

        System.out.println("Me fale o preço do produto: ");
        pre = sc.nextDouble();
        System.out.println("Me fale a quantidade a ser comprada desse produto: ");
        quan = sc.nextDouble();
        sc.nextLine();
        System.out.println("Qual foi o valor entregue pelo cliente? ");
        rec = sc.nextDouble();

        pref = pre * quan;
        troco = rec - pref;

        System.out.println("O troco é " + String.format("%.2f", troco));
        sc.close();



    }
}