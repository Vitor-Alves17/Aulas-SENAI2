package Aula8;
import java.util.Arrays;
import java.util.Scanner;


public class Cpf {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter CPF: ");
            String cpf = sc.nextLine();
            boolean v = true;
            int t;
            int g = 0;
            int e = 0;

            char[] aCPF = cpf.toCharArray();
            int[] bCPF = new int[11];

            for (int i = 0; i < aCPF.length; i++) {
                bCPF[i] = Integer.parseInt(String.valueOf(aCPF[i]));
            }
            System.out.println(Arrays.toString(bCPF));

            if (aCPF.length != 11) {
                v = false;
            }
            if (v == false) {
                System.out.println("Invalid CPF");
            }
            for (int i = 10; i > 1; i--) {
                t = bCPF[e] * i;
                g = g + t;
                e++;
            }
            int vv = g % 11;
            g = 0;
            e = 0;

            for (int i = 11; i > 1; i--) {
                t = bCPF[e] * i;
                g = g + t;
                e++;
            }
            int vv2 = g % 11;

            if (vv < 2){
                if(bCPF[9] != 0){
                    System.out.println("Invalid CPF");
                }
            }else if(11 - vv != bCPF[9]){
                System.out.println("Invalid CPF");
            }else  if (vv2 < 2){
                if(bCPF[10] != 0){
                    System.out.println("Invalid CPF");
                }
            }else if(11 - vv2 != bCPF[10]){
                System.out.println("Invalid CPF");
            }else {
                System.out.println("Valid CPF");
            }
        }
    }
