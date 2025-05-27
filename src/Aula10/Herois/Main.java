package Aula10.Herois;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

        static class Heroi {
            String nome;
            double poder;
            double velocidade;
            double resistencia;

            public Heroi(String nome, double poder, double velocidade, double resistencia) {
                this.nome = nome;
                this.poder = poder;
                this.velocidade = velocidade;
                this.resistencia = resistencia;
            }

            public double poderTotal() {
                return poder + velocidade + resistencia;
            }

            @Override
            public String toString() {
                return nome + " - Poder Total: " + poderTotal();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Heroi> herois = new ArrayList<>();
            Map<String, Heroi> mapaHerois = new HashMap<>();

            int ver;
            do {
                System.out.println("Adicione o nome do herói:");
                String nome = sc.next();

                System.out.println("Adicione o poder:");
                double poder = sc.nextDouble();

                System.out.println("Adicione a velocidade:");
                double velocidade = sc.nextDouble();

                System.out.println("Adicione a resistência:");
                double resistencia = sc.nextDouble();

                Heroi heroi = new Heroi(nome, poder, velocidade, resistencia);
                herois.add(heroi);
                mapaHerois.put(nome.toLowerCase(), heroi);

                System.out.println("Deseja adicionar outro herói? (0 = Não / 1 = Sim)");
                ver = sc.nextInt();

            } while (ver != 0);

            herois.sort((h1, h2) -> Double.compare(h2.poderTotal(), h1.poderTotal()));

            System.out.println("\n--- Ranking de Heróis ---");
            for (int i = 0; i < herois.size(); i++) {
                System.out.println((i + 1) + "º - " + herois.get(i));
            }
        }
}
