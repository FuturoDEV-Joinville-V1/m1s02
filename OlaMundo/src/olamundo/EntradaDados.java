package olamundo;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
//        if (nome.isEmpty()) {
        if (nome.isBlank()) {
            System.out.println("Nome precisa ter algum caractere. Digite seu nome:");
            nome = entrada.nextLine();
        }
        System.out.println("Seu nome é: " + nome);

/*        System.out.println("Qual ano você nasceu?");
        int anoNascimento = Integer.parseInt(entrada.nextLine());

        int idade = 2025 - anoNascimento;

        System.out.println("Sua idade é: " + idade);*/

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Nome completo: " + nome + " " + sobrenome);

/*        System.out.println("Digite sua altura:");
        String strAltura = entrada.nextLine();
        if (strAltura.isEmpty()) {
            System.out.println("Favor digitar um valor para altura.");
            strAltura = entrada.nextLine();
        }
        double altura = Double.parseDouble(strAltura);

        System.out.println("Sua altura é: " + altura);*/

/*
        System.out.println("Seu nome com todas as letras maiúsculas: " + nome.toUpperCase());
        System.out.println("Seu sobrenome com todas as letras minúsculas: " + sobrenome.toLowerCase());
*/

        System.out.println("digite outro sobrenome:");
        String outroSobrenome = entrada.nextLine();
        if (sobrenome.equalsIgnoreCase(outroSobrenome)) {
            System.out.println("são parentes!");
        }

        System.out.printf("Nome completo: %s %s.%n", nome, sobrenome);
        System.out.println("O tamanho do seu nome é: " + nome.length());

/*        System.out.println("Trim nome: " + nome.trim());
        System.out.println("Inicial do sobrenome: " + sobrenome.charAt(0));
        System.out.println("Última letra do sobrenome: " + sobrenome.charAt(sobrenome.length()-1));
        System.out.println("Posição do o: " + nome.indexOf('o'));
        System.out.println("Posição do o: " + nome.lastIndexOf('o'));
        System.out.println(nome.replace('o', '0'));*/

        String primeiroNome = nome;
        if (nome.indexOf(' ') >= 0) {
            primeiroNome = nome.substring(0, nome.indexOf(' '));
        }
        System.out.println(primeiroNome);


    }
}
