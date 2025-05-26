package Aula10.Herois;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Object>> HePo = new ArrayList<>();
    ArrayList<Object> herois = new ArrayList<>();
    ArrayList<Object> poder = new ArrayList<>();
    ArrayList<Object> velocidade = new ArrayList<>();
    ArrayList<Object> resitencia = new ArrayList<>();
    int ver = 1;

    do{
        System.out.println("Adicione o herói:" );
        herois.add(sc.next());
        System.out.println("Adicione o poder: ");
        poder.add(sc.nextDouble());
        System.out.println("Adicione a velocidade: ");
        velocidade.add(sc.nextDouble());
        System.out.println("Adicione a resistência: ");
        resitencia.add(sc.nextDouble());

        System.out.println("Deseja adicionar outro heroi? \n Não -> 0 \n Sim -> 1");
        ver = sc.nextInt();
        }while(ver != 0);
    HePo.add(herois);
    HePo.add(poder);
    HePo.add(velocidade);
    HePo.add(resitencia);
    System.out.println(HePo);

    for(int i = 0; i < HePo.get(0).size(); i++){

        }
    }

    }
}
