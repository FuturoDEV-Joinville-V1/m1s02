package olamundo;

public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        System.out.println("Segunda linha");

        // ano de nascimento do usuário
        int anoNascimento = 1991;

        System.out.println(anoNascimento);

        char primeiraLetraDoNome = 'J';

        System.out.println(primeiraLetraDoNome);

        System.out.println(primeiraLetraDoNome);

        double altura = 1.75;
        System.out.println(altura);

        boolean ehCasado = true;
        System.out.println(ehCasado);

        altura = 1.76;
        System.out.println(altura);

        String nome = "João";

        anoNascimento = 1992;

        System.out.println(altura);

        String nome2 = "Victor";

        int camelCase = 1;
        int camelcase = 2;
        int CAMELCASE = 3;

        final int ANO_DE_NASCIMENTO = 1991;


        long id = 1876876098098L;

        byte idade = 120;
        char letra = 36;

        float peso = 84.5f;

        System.out.println(letra);

        int idadeDoCachorro = (int) 5.5;

        System.out.println("Minha altura é: " + altura);
        System.out.println(altura + 0.02);
        System.out.println(altura + "1");

        System.out.println("Meu nome é: " + nome + " " + nome2 + ", e meu ano de nascimento é " + anoNascimento + ", minha altura é " + altura + "m.");
        System.out.printf("Meu nome é %s %s,%n meu ano de nascimento é %d%n e minha altura é %.2fm."
                , nome, nome2, ANO_DE_NASCIMENTO, altura);
        System.out.println("nova linha");

    }
}
