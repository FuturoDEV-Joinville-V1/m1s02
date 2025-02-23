package olamundo;

import java.util.Scanner;

public class ExemploFor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("digite nome:");
    String nome = entrada.nextLine();

    /*    int cont = 0;
    while (cont < nome.length()) {
      System.out.println(nome.charAt(cont));
      cont++;
    }*/

    for (int i = 0; i < nome.length(); i++) {
      System.out.println(nome.charAt(i));
    }

    System.out.println("Fim");
  }
}
