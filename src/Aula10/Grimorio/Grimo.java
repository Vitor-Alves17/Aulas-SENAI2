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
        ver = true;
        System.out.println("Agora que seu grimório está completo, você deseja buscar algum de seus feitiços? (s/n): ");
        ver2 = sc.nextLine();
        while (ver == true) {
            if (!ver2.equals("s") && !ver2.equals("n")){
                System.out.println("Digito inválido. Tente novamente: ");
                ver2 = sc.nextLine();
                ver = false;
                return;
            } else if (ver2.equals("s")) {
                ver = true;
                System.out.println("Qual feitiço deseja buscar? ");
                String fei = sc.nextLine();
                boolean ver3 = true;
                while(ver == true){
                    for (int i = 0; i < grimos.size(); i++){
                        if(fei.equals(grimos.get(i))){
                            System.out.println("Feitiço " + grimos.get(i) + " localizado na posição " + (i + 1));
                        }else {
                            ver3 = false;
                        }
                        if (ver3 == false){
                            System.out.println("Feitiço não encontrado");
                        }
                        System.out.println("Deseja buscar mais algum feitiço? (s/n): ");
                        ver2 = sc.nextLine();
                        while (!ver2.equals("s") && !ver2.equals("n")){
                            System.out.println("Digito inválido. Tente novamente: ");
                            ver2 = sc.nextLine();
                        }
                        if (ver2.equals("s")){
                            System.out.println("Qual feitiço deseja procurar agora? ");
                            fei = sc.nextLine();
                        } else if (ver2.equals("n")) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
