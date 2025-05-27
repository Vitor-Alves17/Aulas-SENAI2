package Aula10.Mapa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa converte os códigos do mapa misterioso.");
        System.out.println("Adicione os códigos a serem traduzidos: (ex: 3A2B1C, sem espaços): ");
    String cods = sc.next();
    char[] cod = cods.toCharArray();
        System.out.println(Arrays.toString(cod));
        System.out.println(cod[0]);
        for (int i = 0; i < cod.length; i += 2) {
            int repeticoes = Character.getNumericValue(cod[i]);
            char letra = cod[i + 1];
        for (int j = 0; j < repeticoes; j++) {
            System.out.print(letra);            }
        }
        sc.close();
    }
}
