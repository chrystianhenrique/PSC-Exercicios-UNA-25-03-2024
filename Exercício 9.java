public class Main {
    public static void main(String[] args) {
        int populacaoA = 5000000; // População do país A
        double taxaNatalidadeA = 0.03; // Taxa de natalidade do país A (3% ao ano)

        int populacaoB = 7000000; // População do país B
        double taxaNatalidadeB = 0.02; // Taxa de natalidade do país B (2% ao ano)

        int anos = 0;

        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaNatalidadeA; // Atualiza a população do país A com base na taxa de natalidade
            populacaoB += populacaoB * taxaNatalidadeB; // Atualiza a população do país B com base na taxa de natalidade
            anos++;
        }

        System.out.println("A população de A ultrapassará a população de B em " + anos + " anos.");
    }
}