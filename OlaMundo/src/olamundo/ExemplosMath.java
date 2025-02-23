package olamundo;

public class ExemplosMath {
    public static void main(String[] args) {
        double potencia = Math.pow(5, 2);
        System.out.println(potencia);

        double resultSqrt = Math.sqrt(9);
        System.out.println(resultSqrt);

        double resultCbrt = Math.cbrt(27);
        System.out.println(resultCbrt);

        int resultAbs = Math.abs(-10);
        System.out.println(resultAbs);

        double resultFloor = Math.floor(29.9);
        System.out.println(resultFloor);

        double resultCeil = Math.ceil(29.1);
        System.out.println(resultCeil);

        double resultRound = Math.round(5.4);
        System.out.println(resultRound);

        System.out.println(Math.PI);

        double resultRandom = Math.random();
        System.out.println(resultRandom);

        int aleatorio = (int) (Math.random() * (5 - 1) + 1);
        System.out.println(aleatorio);
    }
}
