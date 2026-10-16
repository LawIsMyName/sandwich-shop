import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {

        System.out.println("Welcome to The sandwich shop");
        double isRegular = 5.95;
        double isLarge = 8.95;
        int age = 17;
        double discount2 = .80;

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                          How can I take your order:
                          1. regular = 5.95
                          2. large = 8.95""");

        int choice = scanner.nextInt();

        if (choice == isRegular) {
               double price = 5.95;
        }

        if (choice == isLarge) {
            double price = 8.95;
        }

        if (choice <= age) {
            double discount1 = .90;
        }
















        }






    }
}
