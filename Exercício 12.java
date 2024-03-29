import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (N) da série: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int termo = (i / 2) + (i % 2 == 0 ? 3 : 0); // Calcula o termo conforme o padrão
            System.out.print(termo + " ");
        }

        scanner.close();
    }
}