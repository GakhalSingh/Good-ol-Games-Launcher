import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameCatalog {
    private List<Game> games = new ArrayList<>();

    public void addGame(Scanner scanner) {
        System.out.println("Voer de naam van het spel in: ");
        String name = scanner.next();
        Game game = new Game(name);
        games.add(game);
        System.out.println("Spel " + name + " Toegevoegd aan catalogus");
    }

    public void addReviewToGame(Scanner scanner) {
        System.out.println("Voer de naam van het spel in:");
        String name = scanner.next();
        for (Game game : games) {
            if (game.getName().equalsIgnoreCase(name)) {
                game.addReview(scanner);
                return;
            }
        }
        System.out.println("Geen spellen gevonden：" + name);
    }

    public void displayLeaderboard() {
        games.stream()
                .sorted((g1, g2) -> Double.compare(g2.getAverageScore(), g1.getAverageScore()))
                .forEach(game -> System.out.println(game));
    }
}
