package Aula10.PedraPapelTe;

import java.util.Random;
import java.util.Scanner;

public class Jokepo {
    public static void resu(int jo, int bot, int ganho){
        if(jo == bot) {
            System.out.println("Empate ");
        }else if (jo == ganho){
            System.out.println("Você ganhou ");
        }else{
            System.out.println("Você perdeu ");
        }
    }
    public static String joga(int escolha){
        String jogada;
        switch(escolha){
            case 1 -> jogada = "pedra";
            case 2 -> jogada = "papel";
            case 3 -> jogada = "tesoura";
            case 4 -> jogada = "largato";
            case 5 -> jogada = "spoky";
            default -> throw new IllegalStateException("Unexpected value: " + escolha);
        }
        return jogada;
    }
    public static int parti(String partida){
        int ganhou = 0;
        if(partida.equals("pedrapapel") || partida.equals("papelpedra")){
            ganhou = 2;
        }else if(partida.equals("tesourapapel") || partida.equals("papeltesoura")){
            ganhou = 3;
        }else if(partida.equals("tesouralargato") || partida.equals("largatotesoura")){
            ganhou = 3;
        }else if(partida.equals("largatospoky") || partida.equals("spokylargato")){
            ganhou = 4;
        }else if(partida.equals("spokypedra") || partida.equals("pedraspoky")){
            ganhou = 5;
        }else if(partida.equals("spokytesoura") || partida.equals("tesouraspoky")){
            ganhou = 5;
        }else if(partida.equals("largatopapel") || partida.equals("papellargato")){
            ganhou = 4;
        }else if(partida.equals("spokypapel") || partida.equals("papelspoky")){
            ganhou = 2;
        }else if(partida.equals("tesourapedra") || partida.equals("pedratesoura")){
            ganhou = 1;
        }else if(partida.equals("pedralargato") || partida.equals("largatopedra")){
            ganhou = 1;
        }
        return ganhou;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println(""" 		
                Escolha uma das opções abaixo: 
                1 -> pedra		 
                2 -> papel		 
                3 -> tesoura		 
                4 -> largato		 
                5 -> spoky
                Digite sua escolha:		    
                """);
        int jo = sc.nextInt();
        int bot = r.nextInt(5) + 1;
        String jo1 = joga(jo);
        String bot1 = joga(bot);
        String partida = jo1+bot1;
        int resu = parti(partida);
        System.out.println("Você escolheu: " + jo1 + "\nO bot escolheu: " + bot1);
        resu(jo, bot, resu);
    }
}
