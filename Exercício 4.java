import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalKills = 0;
        int totalDeaths = 0;
        int totalAssists = 0;
        
        boolean winnerFound = false;
        
        while (!winnerFound) {
            System.out.println("Informe o número de kills na rodada:");
            int killsRodada = scanner.nextInt();
            totalKills += killsRodada;
            
            System.out.println("Informe o número de deaths na rodada:");
            int deathsRodada = scanner.nextInt();
            totalDeaths += deathsRodada;
            
            System.out.println("Informe o número de assists na rodada:");
            int assistsRodada = scanner.nextInt();
            totalAssists += assistsRodada;
            
            if (totalKills <= 5) {
                System.out.println("Noob");
            } else if (totalKills >= 20) {
                System.out.println("Master");
            }
            
            if (totalDeaths >= 20) {
                System.out.println("Houston, we have a problem");
            }
            
            if (totalAssists >= 20) {
                System.out.println("Team work");
            }
            
            System.out.println("Há um vencedor? (s/n)");
            String resposta = scanner.next();
            
            if (resposta.equalsIgnoreCase("s")) {
                winnerFound = true;
            }
        }
        
        scanner.close();
    }
}