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
        }else if (primo(senhaArray) != true) {
            System.out.println("Senha invalida, não possui número primo!");
        }else if (espe(senhaArray) != true) {
            System.out.println("Senha invalida, não possui caractere especial!");
        }else if (dupli(senhaArray) != true){
            System.out.println("Senha inválida, possui vogais duplicadas seguidas!");
        }else {
            System.out.println("Senha válida!");
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
            if (Character.isDigit(senha[i])) {
                int numero = Integer.parseInt(String.valueOf(senha[i]));
                if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                    ver = true;
                    break;
                }
            }
        }
        return ver;
    }

    public static boolean espe(char[] senha) {
        boolean ver = false;
        
	for (int i = 0; i < senha.length; i++) {
		if((Character.isLetterOrDigit(senha[i]))){
			ver = true;
		}
	}
            
        return ver;
    }
    public static boolean dupli(char[] senha){
        boolean ver = true;

        for(int i = 1; i < senha.length; i++){
            if(senha[i] == 'a' || senha[i] == 'e' || senha[i] == 'i' || senha[i] == 'o' || senha[i] == 'u' || senha[i] == 'A' || senha[i] == 'E' || senha[i] == 'I' || senha[i] == 'O' || senha[i] == 'U') {
                if (senha[i] == (senha[i - 1])) {
                    ver = false;
                    break;
                }
            }
        }
        return ver;
    }
}
