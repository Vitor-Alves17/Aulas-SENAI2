package Aula10.Grimorio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Grimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao Grimorio-Digital-2000! ");
        System.out.println("Comece adicionando seus feitiços: ");
        boolean ver = true;
        String ver2 = "s";
        ArrayList<String> grimos = new ArrayList<>();

        do {
            grimos.add(sc.nextLine());
            System.out.println("Deseja adicionar um novo feitiço? (s/n): ");
            ver2 = sc.nextLine();
            while(!ver2.equals("s") && !ver2.equals("n")) {
                System.out.println("Digito inválido, digite novamente: ");
                ver2 = sc.nextLine();
            }
            if (ver2.equals("n")) {
                ver = false;
            }
            if(ver == true) {
                System.out.println("Adicione o proximo feitiço: ");
            }
        }while(ver == true);
        //System.out.println(grimos);

        System.out.println("Agora que seu grimório está completo, você deseja buscar algum de seus feitiços? (s/n): ");
        ver2 = sc.nextLine();
        while (!ver2.equals("s") && !ver2.equals("n")) {

        }
    }
}
