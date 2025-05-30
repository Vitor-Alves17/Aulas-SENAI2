package Aula9;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sa;
        //Aqui criamos a variável do salário chamada de "sa". pedimos ao usuário para entrar o valor do sálario
        System.out.println("Digite o sário do funcionário: ");
        sa = sc.nextDouble();
        //ir = imposto de renda, vt = vale transporte, va = vale alimentação, vr = vale refeição, ps = plano de saúde
        double inss, ir, vt = 0, va = 0, vr = 0, ps = 0;
        if (sa <= 1303.00){
            inss = sa * 0.08;
        } else if (sa  <= 2571.00){
            inss = sa * 0.09;
        } else if (sa <= 3856.00) {
            inss = sa * 0.11;
        }else {
           inss = sa * 0.14;
        }

        if (sa <= 1903.98){
            ir = 0;
        } else if (sa  <= 2826.65) {
            ir = sa * 0.075;
        } else if (sa  <= 3751.05) {
            ir = sa * 0.15;
        } else if (sa  <= 4664.68) {
            ir = sa * 0.225;
        }else {
            ir = sa * 0.275;
        }
        System.out.println("O funcionário possui direito à vale transpote? (1 para sim, 0 para não): ");
        int ver = sc.nextInt();
        while (ver != 0 && ver != 1){
            System.out.println("Número inválido! Digite novamente: ");
            ver = sc.nextInt();
        }
        if (ver == 1){
            vt = sa * 0.06;
        }else {
            vt = 0;
        }
        System.out.println("O funcionário possui direito à vale alimentação? (1 para sim, 0 para não): ");
         ver = sc.nextInt();
        while (ver != 0 && ver != 1){
            System.out.println("Número inválido! Digite novamente: ");
            ver = sc.nextInt();
        }
         if (ver == 1){
             va = 200.00;
         }else {
             va = 0;
         }
        System.out.println("O funcionário possui direito à vale refeição? (1 para sim, 0 para não): ");
         while (ver != 0 && ver != 1){
             System.out.println("Número inválido! Digite novamente: ");
             ver = sc.nextInt();
         }
         ver = sc.nextInt();
         if (ver == 1){
             vr = 250.00;
         }else {
             vr = 0;
         }

        System.out.println("O funcionário possui direito à plano de saúde (1 para sim, 0 para não)? ");
         ver = sc.nextInt();
        while (ver != 0 && ver != 1){
            System.out.println("Número inválido! Digite novamente: ");
            ver = sc.nextInt();
        }
         if (ver == 1){
             System.out.println("O plano é simples ou avançado? (1 para simples, 0 para avançado): ");
             ver = sc.nextInt();
             if (ver == 1){
                 ps = 150.00;
             }else if (ver == 0){
                 ps = 300.00;
             }
         } else {
             ps = 0;
         }
         double soma =  inss + ir + va + vr + ps + vt;
        System.out.println("Salário líquido do funcionário: " + "R$" + String.format("%.2f", (sa - soma)));
    }
}
