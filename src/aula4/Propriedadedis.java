package aula4;

import java.util.Scanner;

public class Propriedadedis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d, a1,a2,a3,a4,a5,a6,m1,m2,m3,m4,m5,m6;
        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        c = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        d = sc.nextInt();

        a1 = a + b;
        a2 = a + c;
        a3 = a + d;
        a4 = b + c;
        a5 = b + d;
        a6 = c + d;
        m1 = a * b;
        m2 = a * c;
        m3 = a * d;
        m4 = b * c;
        m5 = b * d;
        m6 = c * d;

        System.out.println("Adições: " + a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "," + a6);
        System.out.println("Multiploicações: " + m1 + "," + m2 + "," + m3 + "," + m4 + "," + m5 + "," + m6);

    }
}
