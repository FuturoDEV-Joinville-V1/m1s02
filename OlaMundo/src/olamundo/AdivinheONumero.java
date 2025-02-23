package olamundo;

import java.util.Scanner;

public class AdivinheONumero {

  // exemplo while
  /*public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Adivinhe um número de 5 a 10");
    int numeroUsuario = Integer.parseInt(entrada.nextLine());

    int random = (int) (Math.random() * (10 - 5) + 5);
    // System.out.println("Aleatorio: " + random);

    while (numeroUsuario != random) {
      System.out.println("Você errou, tente novamente.");
      System.out.println("Adivinhe um número de 5 a 10:");
      numeroUsuario = Integer.parseInt(entrada.nextLine());
    }

    System.out.println("Você acertou!");
  }*/

  // exemplo do-while
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int random = (int) (Math.random() * (10 - 5) + 5);

    int numUsuario;

    do {
      System.out.println("Insira número de 5 a 10:");
      numUsuario = Integer.parseInt(entrada.nextLine());
    } while (numUsuario != random);

    System.out.println("Você acertou!");
  }
}
