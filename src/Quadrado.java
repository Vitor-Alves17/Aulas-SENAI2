import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lar, cum, area, peri, dia1, dia2;

        System.out.println("Me fale a largura: ");
        lar = sc.nextDouble();
        System.out.println("Me fale o comprimento: ");
        cum = sc.nextDouble();

        peri = (lar*2)+(cum*2);
        area = lar * cum;
        dia1 = Math.sqrt((lar*lar)+(cum*cum));


        System.out.println("A área é igual a: " + String.format("%.4f", area));
        System.out.println("O perímetro é: " + String.format("%.4f", peri));
        System.out.println("A diagonal é " + String.format("%.4f", dia1));

        sc.close();


    }
}
