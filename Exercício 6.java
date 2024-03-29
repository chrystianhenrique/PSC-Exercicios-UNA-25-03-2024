import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Bem-vindo ao Jogo de Adivinhação!");
            System.out.println("Estou pensando em um número entre 1 e 100...");
            System.out.println("Tente adivinhar qual é!");

            int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
            int tentativas = 0;
            boolean acertou = false;

            while (!acertou) {
                System.out.print("Digite seu palpite: ");
                int palpite = scanner.nextInt();
                tentativas++;

                if (palpite < numeroSecreto) {
                    System.out.println("Muito baixo. Tente novamente.");
                } else if (palpite > numeroSecreto) {
                    System.out.println("Muito alto. Tente novamente.");
                } else {
                    acertou = true;
                }
            }

            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");

            System.out.print("Gostaria de jogar novamente? (s/n): ");
            String resposta = scanner.next();

            jogarNovamente = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Obrigado por jogar! Até a próxima!");

        scanner.close();
    }
}