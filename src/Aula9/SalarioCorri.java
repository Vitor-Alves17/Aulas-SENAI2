package Aula9;

import java.util.Scanner;

public class SalarioCorri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Trabalho de Lyan Brito e Vitor Alves
        double sa;
        //Aqui criamos a variável do salário chamada de "sa". pedimos ao usuário para entrar o valor do sálario
        System.out.println("Digite o sário do funcionário: ");
        sa = sc.nextDouble();
        //ir = imposto de renda, vt = vale transporte, va = vale alimentação, vr = vale refeição, ps = plano de saúde, depe = dependentes
        double inss, ir, vt = 0, va = 0, vr = 0, ps = 0, depe = 0;

        System.out.println("Diga o número de dependentes do funcionário: ");
        depe = sc.nextDouble();
        //Os métodos abaixo calcula automaticamente o valor do INSS e do imposto de Renda baseando-se no valor do sálario do funcionáraio
       inss = inssCal(sa);
       ir = irCal(sa, depe);
        //A senquencia de códigos abaixo é ultilizado para que o usuário possa definir se o funcionário possui direito os beneficios ao não
        //A pergunta referente ao direito dos funcionários aos benefícios é respondido com 1 ou 0 para melhor eficiência e menor margem de erro. Não afeta diretamente no funcionamento do código. Por isso optamos por essa abordagem.
        //Os blocos de while servem para garantir que o usuário só consiga finalizar o código colocando 1 ou 0
        System.out.println("O funcionário possui direito à vale transpote? (1 para sim, 0 para não): ");
        int ver = sc.nextInt();
        while (ver != 1 && ver != 0) {
            System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
            ver = sc.nextInt();
        }
        if (ver == 1){
            vt = sa * 0.06;
        }else {
            vt = 0;
        }
        System.out.println("O funcionário possui direito à vale alimentação? (1 para sim, 0 para não): ");
         ver = sc.nextInt();
            while (ver != 1 && ver != 0) {
                System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
                ver = sc.nextInt();
            }
         if (ver == 1){
             va = 200.00;
         }else {
             va = 0;
         }
        System.out.println("O funcionário possui direito à vale refeição? (1 para sim, 0 para não): ");
         ver = sc.nextInt();
        while (ver != 1 && ver != 0){
            System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
            ver = sc.nextInt();
        }
         if (ver == 1){
             vr = 250.00;
         }else {
             vr = 0;
         }

        System.out.println("O funcionário possui direito à plano de saúde (1 para sim, 0 para não)? ");
         ver = sc.nextInt();
         while (ver != 1 && ver != 0){
             System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
             ver = sc.nextInt();
         }
         if (ver == 1){
             System.out.println("O plano é simples ou avançado? (1 para simples, 0 para avançado): ");
             ver = sc.nextInt();
             while (ver != 1 && ver != 0){
                 System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
                 ver = sc.nextInt();
             }
             if (ver == 1){
                 ps = 150.00;
             }else if (ver == 0){
                 ps = 300.00;
             }
         } else {
             ps = 0;
         }
        //Aqui é feito a soma de todos os decontos cabíveis ao funcionário (o resultado dessa soma é armazenada na variável soma). Por fim, o código exibe a porcentagem de desconto do sálario e valor do sálario líquido.
         double soma =  inss + ir + va + vr + ps + vt;
        System.out.println("O percentual de desconto sobre o salário desse funcionário é de " + String.format("%.2f", ((soma * 100) / sa)) + "%");
        System.out.println("Salário líquido do funcionário: " + "R$" + String.format("%.2f", (sa - soma)));
    }
    //método para calcular o inss
    public static double inssCal(double sa1){
        double inss2;

        if (sa1 <= 1303.00){
            inss2 = sa1 * 0.08;
        } else if (sa1  <= 2571.00){
            inss2 = sa1 * 0.09;
        } else if (sa1 <= 3856.00) {
            inss2 = sa1 * 0.11;
        }else {
            inss2 = sa1 * 0.14;
        }
        return inss2;
    }
    //método para calcular o imposto de renta com desconto de dependentes
    public static double irCal(double sa1, double depe){
        double ir2;

        sa1 = sa1 - (189.59 * depe);

        if (sa1 <= 1903.98){
            ir2 = 0;
        } else if (sa1  <= 2826.65) {
            ir2 = sa1 * 0.075;
        } else if (sa1  <= 3751.05) {
            ir2 = sa1 * 0.15;
        } else if (sa1  <= 4664.68) {
            ir2 = sa1 * 0.225;
        }else {
            ir2 = sa1 * 0.275;
        }

        return ir2;
    }
}
