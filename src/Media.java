import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double id2, id1, media;
        String nom1, name2;

        System.out.println("Me fale o nome da primeira pessoa: ");
        nom1 = sc.nextLine();
        System.out.println("Me fale a altura dessa pessoa:");
        id1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("Agora me fale o nome da segunda pessoa: ");
        name2 = sc.nextLine();
        System.out.println("Agora a altura dessa pessoa: ");
        id2 = sc.nextDouble();

        media = (id1 + id2) / 2;

        System.out.println("A altura média de " + nom1 + " e " + name2 + " é de " + String.format("%.1f", media));
        sc.close();



    }
}
