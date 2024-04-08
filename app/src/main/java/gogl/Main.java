package gogl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class HomePage{
    int number;
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

    number = scanner.nextInt();
    }
}

class Ranglijsten{
    int number;

    public MenuRanglijst() {
    System.out.println("Selecteer een sorteer methode.");
    System.out.println("1 - Geen");
    System.out.println("2 - Rating Hoog - Laag");
    System.out.println("3 - Rating Laag - Hoog");
    System.out.println("4 - Terug naar menu");
    number = scanner.nextInt();

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
                HomePage();
            }
            break;
        case 2:
//                komt zo
            HomePage();
            break;
        case 3:
            // wip
            HomePage();
            break;
        case 4:
            HomePage();
            break;
        default:
            System.out.println("Invoer niet herkent, probeer het opnieuw.");
            showMenuRanglijst();
    }
}

}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomePage homePage = new HomePage();
        Ranglijsten ranglijsten = new Ranglijsten();
        homePage();

        switch (number) {
            case 1:

                ranglijsten;
                break;
            case 2:
                showMenuReviews();
                break;
            case 3:
                showMenuSales();
                break;
            default:
                System.out.println("Invoer niet herkent, probeer het opnieuw.");
                showMenu();
        }

        scanner.close();
    }



    public static void showMenuReviews() {
        // wip
        try {
            File file = new File("reviews.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data); // Print each line from the CSV file
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("CSV bestand niet gevonden.");
            showMenu();
        }
    }

    public static void showMenuSales() {
        // Implement showMenuSales method
    }
}
