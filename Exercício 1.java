import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro e positivo.");
        int numUM = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro e positivo.");
        int numDois = scanner.nextInt();

        System.out.println("Digite o terceiro numero inteiro e positivo.");
        int numTres = scanner.nextInt();

        scanner.close();

        int produtosImpares = 1;
        int somaPares = 0;

        if (numUM % 2 != 0) {
            produtosImpares *= numUM;
        } else {
            somaPares += numUM;
        }
        if (numDois % 2 != 0) {
            produtosImpares *= numDois;
        } else {
            somaPares += numDois;
        }
        if (numTres % 2 != 0) {
            produtosImpares *= numTres;
        } else {
            somaPares += numTres;
        }

        System.out.println("O produto dos numeros ímpares é: " + produtosImpares);
        System.out.println("A soma dos numeros pares é: " + somaPares);
    }
}
