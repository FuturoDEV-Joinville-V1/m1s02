package olamundo;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        boolean ehPar;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento?");
        int anoNascimento = Integer.parseInt(entrada.nextLine());

        ehPar = anoNascimento % 2 == 0;

        System.out.println("Seu ano de nascimento é par? " + ehPar);

        int idade = 2025 - anoNascimento;

        System.out.println("Sua idade é: " + idade);

        //idade = idade + 1;
        System.out.println("Seu próximo aniversário será de: " + idade++); // idade = idade + 1
        System.out.println("Idade: " + idade);

        //idade -= 1;
        System.out.println("Idade: " + --idade);
    }
}
