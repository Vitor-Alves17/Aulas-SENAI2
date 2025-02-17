package aula4;

import java.util.Scanner;

public class Combutivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ve, tem, li, di;
        System.out.println("Me fale a velocidade média(km/h): ");
        ve = sc.nextDouble();
        System.out.println("Agora me fale o tempo gasto(horas): ");
        tem = sc.nextDouble();
        di = tem * ve;
        li = di / 12;
        System.out.println("O tempo gasto na viagem foi de " + tem + "horas");
        System.out.println("A distancia percorrida na viagem foi de: " + di + "km");
        System.out.println("A velocidade média do carro era de " + ve + "km/h");
        System.out.println("A quantide em litros de gasolina usada nessa viagem foi de " + String.format("%.2f", li));
    }
}
