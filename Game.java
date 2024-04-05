import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private String name;
    private List<Review> reviews = new ArrayList<>();

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addReview(Scanner scanner) {
        System.out.println("Voeg " + name + " evaluaties toe:");
        int gameplay = Utility.readIntInput(scanner, "Gameplay-beoordelingen (1-10):");
        int graphics = Utility.readIntInput(scanner, "Grafisch scoren (1-10):");
        int story = Utility.readIntInput(scanner, "Verhaallijn beoordelingen (1-10):");
        reviews.add(new Review(gameplay, graphics, story));
        System.out.println("Evaluatie toegevoegd。");
    }

    public double getAverageScore() {
        return reviews.stream()
                .mapToDouble(Review::getAverageScore)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return String.format("%s - Gemiddelde waardering. %.2f", name, getAverageScore());
    }
}
