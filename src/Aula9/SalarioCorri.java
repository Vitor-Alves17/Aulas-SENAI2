package Aula9;

import java.util.Scanner;

public class SalarioCorri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalSa cal = new CalSa();

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
       inss = cal.inssCal(sa);
       ir = cal.irCal(sa, depe);
        //A senquencia de códigos abaixo é ultilizado para que o usuário possa definir se o funcionário possui direito os beneficios ao não
        //A pergunta referente ao direito dos funcionários aos benefícios é respondido com 1 ou 0 para melhor eficiência e menor margem de erro. Não afeta diretamente no funcionamento do código. Por isso optamos por essa abordagem.
        //Os blocos de while servem para garantir que o usuário só consiga finalizar o código colocando 1 ou 0
        System.out.println("O funcionário possui direito à vale transpote? (1 para sim, 0 para não): ");
        int ver = sc.nextInt();
        while (ver != 1 && ver != 0) {
            System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
            ver = sc.nextInt();
        }
      vt = cal.vt1(sa, ver);

        System.out.println("O funcionário possui direito à vale alimentação? (1 para sim, 0 para não): ");
         ver = sc.nextInt();
            while (ver != 1 && ver != 0) {
                System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
                ver = sc.nextInt();
            }
       va = cal.va2(sa, ver);

        System.out.println("O funcionário possui direito à vale refeição? (1 para sim, 0 para não): ");
         ver = sc.nextInt();
        while (ver != 1 && ver != 0){
            System.out.println("Número digitado inválido! Digite um número (1 para sim, 0 para não): ");
            ver = sc.nextInt();
        }
        vr = cal.vr3(va, ver);

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
            ps = cal.ps4(sa, ver);
         } else {
             ps = 0;
         }
        //Aqui é feito a soma de todos os decontos cabíveis ao funcionário (o resultado dessa soma é armazenada na variável soma). Por fim, o código exibe a porcentagem de desconto do sálario e valor do sálario líquido.
         double soma =  inss + ir + va + vr + ps + vt;
        System.out.println("O percentual de desconto sobre o salário desse funcionário é de " + String.format("%.2f", ((soma * 100) / sa)) + "%");
        System.out.println("Salário líquido do funcionário: " + "R$" + String.format("%.2f", (sa - soma)));
    }
    }
