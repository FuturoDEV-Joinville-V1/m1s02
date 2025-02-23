package olamundo;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Switch {
  public static void main(String[] args) {
    ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
    ZonedDateTime hoje = ZonedDateTime.now(zoneId);
    Month mes = hoje.getMonth();
    int mesNumerico = mes.getValue();
    String result =
        switch (mesNumerico) {
          case 1 -> "Janeiro";
          case 2 -> "Fevereiro";
          case 3 -> "Março";
          case 4, 5, 6 -> "Segundo trimestre";
          case 7, 8, 9, 10, 11, 12 -> "Segundo semestre";
          default -> "Valor inválido.";
        };

    System.out.println(result);
  }
}
