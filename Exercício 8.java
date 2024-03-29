import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número real A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o número inteiro B: ");
        int b = scanner.nextInt();

        double produto = calcularProduto(a, b);
        System.out.println("O produto de " + a + " por " + b + " é: " + produto);

        scanner.close();
    }

    public static double calcularProduto(double a, int b) {
        double produto = 0;

        for (int i = 0; i < Math.abs(b); i++) {
            produto += a;
        }

        if (b < 0) {
            produto = -produto; // Se b for negativo, o produto será negativo
        }

        return produto;
    }
}