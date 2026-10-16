import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {

        // add print function for program start
        System.out.println("Welcome to The sandwich shop");
        // declaration of variables
        int age = 17;
        double discount = .80;
        // add scanner
        Scanner scanner = new Scanner(System.in);
        // print function for menu items
        System.out.println("""
                          How can I take your order:
                          1. regular = 5.95
                          2. large = 8.95
                          Enter option number here: """);

        // add the scanner function and declare variable
        int choice = scanner.nextInt();

        // declare the choice variable
        double choicePrice = 0.0;

        // add if and else if statements for choicePrice with pricing
        if (choice == 1) {
            choicePrice = 5.95;
        } else if (choice == 2 )  {
             choicePrice = 8.95;
        }
        // add prompt for age
        System.out.println("Enter age: ");
        // add next scanner and declare variable
        int choiceAge = scanner.nextInt();

        // add if and else if statements for choiceAge with discount
        if (choiceAge <= age) {
             discount = .90;
        } else if (choiceAge >= age) {
             discount = .80;

        }

        // add print function and final message for total price with discount applied
        System.out.println("The total price is: " + choicePrice * discount);
















        }






    }

