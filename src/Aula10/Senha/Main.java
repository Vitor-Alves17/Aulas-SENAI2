package Aula10.Senha;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, esse programa serve para verificar uma senha. Digite a senha a ser verificada: ");
        String senha = sc.nextLine();
        char[] senhaArray = senha.toCharArray();

        if (up(senhaArray) != true) {
            System.out.println("Senha invalida, não possui letra maiúscula!");
        }
        if (primo(senhaArray) != true) {
            System.out.println("Senha invalida, não possui número primo!");
        }
        if (espe(senha) != true) {
            System.out.println("Senha invalida, não possui caractere especial!");
        }

    }
    public static boolean up(char[] senha) {
        boolean ver = false;

        for (int i = 0; i < senha.length; i++) {
            if (Character.isUpperCase(senha[i])) {
                ver = true;
            }
        }
        return ver;
    }
    public static boolean primo(char[] senha) {
        boolean ver = false;

        for (int i = 0; i < senha.length; i++) {
            if (Integer.parseInt(String.valueOf(senha[i])) == 2 || Integer.parseInt(String.valueOf(senha[i])) == 3 || Integer.parseInt(String.valueOf(senha[i])) == 5 || Integer.parseInt(String.valueOf(senha[i])) == 7) {
                ver = true;
                break;
            }
        }
        return ver;
    }
    public static boolean espe(String senha) {
        boolean ver = false;

        Pattern especial = Pattern.compile("[!@#$%&*()]");
        Matcher matcher = especial.matcher(senha);
        return matcher.find();
    }
}
