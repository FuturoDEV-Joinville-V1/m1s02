package olamundo;

import java.util.Scanner;

public class Condicionais {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira seu ano de nascimento:");
    int anoNascimento = Integer.parseInt(entrada.nextLine());
    int idade = 2025 - anoNascimento;
    if (idade >= 18) {
      System.out.println("Você é maior de idade.");
    } else {
      System.out.println("Você é menor de idade.");
    }

    System.out.printf("Você possui %d anos de idade.%n", idade);

    if (idade < 16) {
      System.out.println("Não pode votar.");
    } else if (idade < 18 || idade >= 70) {
      System.out.println("Pode votar.");
    } else {
      System.out.println("Obrigatório votar.");
    }

    System.out.println("Digite sua senha:");
    String senha = entrada.nextLine();
    String senhaBanco = "123";
    int anoNascimentoBanco = 1991;

    if (!senha.equals(senhaBanco)) {
      System.out.println("Usuário inexistente.");
    } else {
      if (anoNascimentoBanco != anoNascimento) {
        System.out.println("Acesso negado.");
      } else {
        System.out.println("Acesso permitido.");
      }
    }

    String status = idade >= 18 ? "Adulto" : "Menor de idade";
    System.out.println(status);

    double media = 7.0;

    String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
    System.out.println(resultado);

    String ehPar = idade % 2 == 0 ? "Par" : "Ímpar";
    System.out.printf("Sua idade é %s.%n", ehPar);
  }
}
