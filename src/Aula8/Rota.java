package Aula8;

import java.util.Arrays;
import java.util.Scanner;

public class Rota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int b = a[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            int j = 1;
            if (j >= b - 1) {
                break;
            }else{
            a[j] = a[i];
            }
        }
        a[0] = b;
        System.out.println(Arrays.toString(a));
    }
}
