public class Main {
    public static void main(String[] args) {
        double massaInicial = 1.0; 
        double taxaPerda = 0.25; 
        double massaLimite = 0.10; 
        int tempo = 0; 

        while (massaInicial > massaLimite) {
            massaInicial *= (1 - taxaPerda); 
            tempo += 30; 
        }

        System.out.println("Tempo necessário para que a massa seja menor que 0,10 gramas: " + tempo + " segundos.");
    }
}