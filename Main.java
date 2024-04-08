public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        ASCIIArt.displayMainMenu();
        gameManager.run();


    }

    public class ASCIIArt {
        private static void displayMainMenu() {
            System.out.println("\nWelkom bij het beoordelingssysteem voor retrogames.");
            System.out.println("Hier kun je je favoriete retrogames beoordelen en de gamekaarten bekijken.");
            System.out.println("         __");
            System.out.println("       /    \\");
            System.out.println("      |  oo  |");
            System.out.println("      |      |  ");
            System.out.println("  /\\/\\ (|  |) /\\//");
            System.out.println(" /    \\_\\/_\\/_/    \\");
            System.out.println("      |______|");
            System.out.println("      \\  /\\  /");
            System.out.println("       \\/  \\/");
            System.out.println("       |    |");
            System.out.println("       |    |");
            System.out.println("      _|    |_");
            System.out.println("     (___/\\___)");
        }
    }




}