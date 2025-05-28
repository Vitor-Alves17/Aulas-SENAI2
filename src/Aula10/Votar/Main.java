package Aula10.Votar;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Olá!, esse programa serve para efetuar uma votação.");
    System.out.println("Digite a quantidade de candidatos: ");
    int candi = sc.nextInt();
    String[] candidatos = new String[candi];
    int[] votos = new int[candi];

    System.out.println("Agora fale o nome dos candidatos: ");
for(int i = 0; i < candi; i++){
    candidatos[i] = sc.next();
}
    System.out.println("Agora comecmçar a votação: ");
    for(int i = 0; i < candi; i++){
        System.out.println(candidatos[i] + " -> " + i);
    }
        int ver = 0;
    do{
        int voto = sc.nextInt();
        votos[voto]++;
        System.out.println("Deseja continuar a votação? ");
        System.out.println("""
                Sim -> 1
                NÃ£o -> 2
                """);
        ver = sc.nextInt();
                while (ver != 1 && ver != 2) {
                    System.out.println("Digito inválido, tente novamente: ");
                    ver = sc.nextInt();
                }
                if (ver == 2) {
                    System.out.println("Votação encerrada.");
                }else {
                    System.out.println("Digite o próximo voto: ");
                }
    }while(ver != 2);
    int total = 0;
    for (int i = 0; i < candi; i++){
        total += votos[i];
    }
    System.out.println("Resultado da votação: ");
    for(int i = 0; i < candi; i++){
        System.out.println(candidatos[i] + " -> " + votos[i] + " " + ((votos[i] * 100) / total) + "% dos votos");
    }


    }




}
