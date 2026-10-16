import java.util.Scanner;

public class PointOfSale {
    public static void main(String[] args) {
        // declaration of variables
        double discount = .80;
        int adolescentAge = 17;
        int elderlyAge = 65;


        System.out.println("Welcome to The sandwich shop");



        Scanner scanner = new Scanner(System.in);

        // print menu items
        System.out.println("""
                          How can I take your order:
                          1. regular = 5.95
                          2. large = 8.95
                          Enter option number here: """);

        //  declare variable and read the choice
        int choice = scanner.nextInt();

        // declare the choice variable
        double price = 0.0;

        // add if and else if statements for price with pricing
        if (choice == 1) {
            price = 5.95;
        } else if (choice == 2 )  {
             price = 8.95;
        }

        // add prompt for age
        System.out.println("Enter age: ");
        // add next scanner and declare variable
        int age = scanner.nextInt();

        // add if and else if statements for age with discount
        if (age <= adolescentAge) {
             discount = .10;
        } else if (age >= elderlyAge ) {
             discount = .20;
        }

        // add print function and final message for total price with discount applied
        System.out.println("The total price is: " + price * (1 - discount));
















        }






    }

