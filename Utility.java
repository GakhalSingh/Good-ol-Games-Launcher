import java.util.Scanner;

public class Utility {
    public static int readIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next(); // Consume and ignore invalid inputs
            System.out.println("Voer geldige nummers in:");
        }
        return scanner.nextInt();
    }

    public static int readIntInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return readIntInput(scanner);
    }
}
