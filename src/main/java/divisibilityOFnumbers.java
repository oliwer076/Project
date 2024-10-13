import java.util.Scanner;

public class divisibilityOFnumbers {
    public static void main(String[] args) {

//        Write code that takes a number and displays the appropriate text depending on:
//      * If the number is divisible by 3, the program should print the word "fizz"
//      * If the number is divisible by 5, the program should print the word "buzz"
//      * If the number is divisible by 3 and 5, the program should print the word "fizzbuzz"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        if (scanner.hasNext()) {
            int number = scanner.nextInt();
            String litera = scanner.nextLine();
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz!");
                System.out.println("Your number is divisible by 3 and 5!");
            } else if (number % 3 == 0) {
                System.out.println("fizz");
                System.out.println("Your number is divisible by 3!");
            } else if (number % 5 == 0) {
                System.out.println("buzz!");
                System.out.println("Your number is divisible by 5!");
            } else {
                System.out.println("I'm sorry, but the given number is not divisible by either 3 or 5 :( ");
            }

        }
        System.out.println();
        System.out.println("Do you want to continue?");
        System.out.println("yes/no ");
        String cont = scanner.nextLine();
        if (cont.equals("yes")) {
            main(args);
        } else if (cont.equals("no")) {
            System.out.println("Thank you for your response.");
        } else {
            System.out.println("I'm sorry, but I don't understand.");
        }
    }
}