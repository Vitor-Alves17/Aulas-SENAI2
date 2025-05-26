package Aula10.CalculaErro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double c;
        
        System.out.println("""
                Olá, esse programa é uma calculadora simples que retorna os resultados com uma pequena margem de erro.
                Adicione o primeiro número: 
                """);
        double a = sc.nextDouble();
        System.out.println("Agora adicione o segundo número: ");
        double b = sc.nextDouble();
        System.out.println("""
                Você deseja realizar qual operação?
                soma -> Digite: 1
                subtracao -> Digite: 2
                multiplicacao -> Digite: 3
                divisao -> Digite: 4
                """);
        int ver = sc.nextInt();
        while (ver != 1 && ver != 2 && ver != 3 && ver != 4){
            System.out.println("Digito invalido, tente novamente: ");
            ver = sc.nextInt();
        }
        while (ver == 1 || ver == 2 || ver == 3 || ver == 4) {
            if (ver == 1){
                System.out.println("Resultado: " + (a + b + erro(a + b)));
            } else if (ver == 2) {
                System.out.println("Resultado: " + (a - b + erro(a - b)));
            } else if (ver == 3) {
                System.out.println("Resultado: " + (a * b + erro(a * b)));
            } else if (ver == 4) {
                System.out.println("Resultado: " + (a / b + erro(a / b)));
            }
            System.out.println("""
                    
                    Deseja Fazer outro calculo? 
                Não -> Digite: 0
                soma -> Digite: 1
                subtracao -> Digite: 2
                multiplicacao -> Digite: 3
                divisao -> Digite: 4
                    """);
            ver = sc.nextInt();
            if (ver == 0) {
                break;
            }
            System.out.println("Digite o primeiro número: ");
            a = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            b = sc.nextDouble();

        }
    }
    public static double erro(double a){
        double b = a / 100;
        return b;
    }
}
