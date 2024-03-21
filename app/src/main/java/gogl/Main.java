package gogl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welkom in de GoG dashboard!");
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Selecteer een menu: (1/2/3)");
        System.out.println("1 - Ranglijsten");
        System.out.println("2 - Reviews");
        System.out.println("3 - Sales");

        int number = scanner.nextInt();

        switch (number) {
            case 1:

                showMenuRanglijst();
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

    public static void showMenuRanglijst() {

        Scanner scannernumber = new Scanner(System.in);

        System.out.println("Selecteer een sorteer methode.");
        System.out.println("1 - Geen");
        System.out.println("2 - Rating Hoog - Laag");
        System.out.println("3 - Rating Laag - Hoog");
        System.out.println("4 - Terug naar menu");
        int number = scannernumber.nextInt();

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
                    showMenu();
                }
                break;
            case 2:
//                komt zo
                showMenu();
                break;
            case 3:
                // wip
                showMenu();
                break;
            case 4:
                showMenu();
                break;
            default:
                System.out.println("Invoer niet herkent, probeer het opnieuw.");
                showMenuRanglijst();
        }
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
