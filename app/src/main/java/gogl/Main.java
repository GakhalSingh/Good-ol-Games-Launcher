package gogl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class HomePage{
    private Scanner scanner;

    public HomePage(){
    System.out.println("Welkom in de GoG dashboard!");
    System.out.println("------------------------------");
    System.out.println("");
    System.out.println("    ##          ##");
    System.out.println("      ##      ##");
    System.out.println("    ##############");
    System.out.println("  ####  ######  ####");
    System.out.println("######################");
    System.out.println("##  ##############  ## ");
    System.out.println("##  ##          ##  ##");
    System.out.println("      ####  ####");
    System.out.println("");
    System.out.println("------------------------------");
    System.out.println("Selecteer een menu:");
    System.out.println("1 - Ranglijsten");
    System.out.println("2 - Reviews");
    System.out.println("3 - Sales");

    int number = scanner.nextInt();

        switch (number) {
            case 1:
                Ranglijsten ranglijsten = new Ranglijsten();
                ranglijsten.showMenuRanglijst();
                break;
            case 2:
                Reviews reviews = new Reviews();
                reviews.showMenuReviews();
                break;
            case 3:
            //    showMenuSales();
                break;
            default:
                System.out.println("Invoer niet herkend, probeer het opnieuw.");
                new HomePage(); // Restart homepage if invalid input
        }

        scanner.close();
    }
}

class Ranglijsten{
    private Scanner scanner;
    public Ranglijsten() {
        scanner = new Scanner(System.in);
    }
    public void showMenuRanglijst() {
    System.out.println("Selecteer een sorteer methode.");
    System.out.println("1 - Geen");
    System.out.println("2 - Rating Hoog - Laag");
    System.out.println("3 - Rating Laag - Hoog");
    System.out.println("4 - Terug naar menu");
    int number = scanner.nextInt();

    switch (number) {
        case 1:
            try {
                File file = new File("data/ranglijst.csv");
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    System.out.println(data);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("CSV bestand niet gevonden 😔");
                new HomePage();
            }
            break;
        case 2:
        // Implement rating hoog - laag
            break;
        case 3:
            // Implement rating laag - hoog
            break;
        case 4:
            new HomePage();
            break;
        default:
            System.out.println("Invoer niet herkent, probeer het opnieuw.");
            showMenuRanglijst();
    }
}

}

class Reviews {
    public void showMenuReviews() {
        try {
            File file = new File("reviews.csv");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSV bestand niet gevonden.");
            new HomePage();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomePage homePage = new HomePage();
        Ranglijsten ranglijsten = new Ranglijsten();
        Reviews reviews = new Reviews();
        new HomePage();
        scanner.close();
    }
}




