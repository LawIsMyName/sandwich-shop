import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {

        System.out.println("Welcome to The sandwich shop");
        int age = 17;
        double discount = .80;

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                          How can I take your order:
                          1. regular = 5.95
                          2. large = 8.95""");

        int choice = scanner.nextInt();

        System.out.println("Enter option number: ");

        double choicePrice = 0.0;

        if (choice == 1) {
            choicePrice = 5.95;
        } else if (choice == 2 )  {
             choicePrice = 8.95;
        }
        System.out.println("Enter age: ");

        int choiceAge = scanner.nextInt();

        if (choiceAge <= age) {
             discount = .90;
        } else if (choiceAge >= age) {
             discount = .80;

        }

        System.out.println("The total price is: " + choicePrice * discount);
















        }






    }

