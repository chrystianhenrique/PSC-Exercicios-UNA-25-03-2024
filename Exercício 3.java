import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdPessoas = 10;
        int qtdMaiores50 = 0;
        double somaAlturas = 0;
        int qtdPessoasEntre10e20 = 0;
        int qtdPessoasPesoMenor40 = 0;

        for (int i = 1; i <= qtdPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            System.out.println("Informe a altura (em metros) da pessoa " + i + ":");
            double altura = scanner.nextDouble();

            System.out.println("Informe o peso (em quilos) da pessoa " + i + ":");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                qtdMaiores50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturas += altura;
                qtdPessoasEntre10e20++;
            }

            if (peso < 40) {
                qtdPessoasPesoMenor40++;
            }
        }

        System.out.println("a) Quantidade de pessoas com idade superior a 50 anos: " + qtdMaiores50);

        if (qtdPessoasEntre10e20 > 0) {
            double mediaAlturas = somaAlturas / qtdPessoasEntre10e20;
            System.out.println("b) Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas + " metros");
        } else {
            System.out.println("b) Não há pessoas com idade entre 10 e 20 anos.");
        }

        double percentualPesoMenor40 = (double) qtdPessoasPesoMenor40 / qtdPessoas * 100;
        System.out.println("c) Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas: " + percentualPesoMenor40 + "%");

        scanner.close();
    }
}