import java.util.Scanner;

public class Prearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lar, cum, pre, area, pret;

        System.out.println("Primeiro fale a largura do cômodo: ");
        lar = sc.nextDouble();
        System.out.println("Agora me fale o comprimento:");
        cum = sc.nextDouble();
        System.out.println("Agora me fale o preço do metro²:");
        pre = sc.nextDouble();

        area = cum * lar;
        pret = area * pre;

        System.out.println("Largura: " + String.format("%.1f", lar));
        System.out.println("Comprimento: " + String.format("%.1f", cum));
        System.out.println("Preço por metro² : " + String.format("%.1f", pre));

        System.out.println("A área total é de " + String.format("%.2f", area));
        System.out.println("O preço total é: " + String.format("%.2f", pret));
        sc.close();
    }

}
