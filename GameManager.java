import java.util.Scanner;

public class GameManager {
    private GameCatalog gameCatalog = new GameCatalog();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\nSelecteer actie: \n1) Spel toevoegen\n2) Spelwaardering toevoegen\n3) Leaderboard weergeven\n4) Afsluiten");
            int choice = Utility.readIntInput(scanner);
            switch (choice) {
                case 1:
                    gameCatalog.addGame(scanner);
                    break;
                case 2:
                    gameCatalog.addReviewToGame(scanner);
                    break;
                case 3:
                    gameCatalog.displayLeaderboard();
                    break;
                case 4:
                    running = false;
                    System.out.println("Bedankt voor uw gebruiken.");
                    break;
                default:
                    System.out.println("Ongeldige opties.");
                    break;
            }
        }
        scanner.close();
    }
}
