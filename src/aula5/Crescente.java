package aula5;

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        double ter = 0;
        double pri = 0;
        double seg = 0;

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        if(a<b && a<c){
            pri = a;
        } else if(a>b && a<c || a<b && a>c){
            seg = a;
        }else {
            ter = a;
        }

        if(b<a && b<c){
            pri = b;
        } else if(b>a && b<a || b<a && b>c){
            seg = b;
        }else {
            ter = b;
        }

        if(c<b && c<a){
            pri = c;
        } else if(c>b && c<a || c<b && c>a){
            seg = c;
        }else {
            ter = c;
        }

        System.out.println(pri + " " + seg + " " + ter);





    }
}
