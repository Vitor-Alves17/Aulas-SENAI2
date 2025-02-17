package aula4;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double peso, altura, imc;
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura (em metros): ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("aula4.IMC: "+ String.format("%.2f", imc));

        if(imc < 18.5){
            System.out.print("abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.print("normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.print("sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.print("obesidade 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.print("obesidade 2");
        } else if (imc >= 40) {
            System.out.print("obesidade 3");
        }
    }
}
