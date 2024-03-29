import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNota1 = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int matriculaMaiorNota1 = 0;
        int maiorNota2 = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int matriculaMaiorNota2 = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Digite a matrícula do aluno:");
            int matricula = scanner.nextInt();

            System.out.println("Digite a nota do aluno:");
            int nota = scanner.nextInt();

            if (nota > maiorNota1) {
                maiorNota2 = maiorNota1;
                matriculaMaiorNota2 = matriculaMaiorNota1;
                maiorNota1 = nota;
                matriculaMaiorNota1 = matricula;
            } else if (nota > maiorNota2) {
                maiorNota2 = nota;
                matriculaMaiorNota2 = matricula;
            }
        }

        System.out.println("A maior nota é: " + maiorNota1 + ", Matrícula do aluno: " + matriculaMaiorNota1);
        System.out.println("A segunda maior nota é: " + maiorNota2 + ", Matrícula do aluno: " + matriculaMaiorNota2);

        scanner.close();
    }
}