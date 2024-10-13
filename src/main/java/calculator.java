import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value please:");
        int first = scanner.nextInt();

        System.out.println("Enter the secound value please:");
        int secound = scanner.nextInt();
        System.out.println();

        System.out.println("Result of adding = " + (first + secound));
        System.out.println("Result of subtraction = " + (first - secound));
        System.out.println("Result of multiplication = " + (first * secound));
        System.out.println("Result of division = " + (first / secound));
    }
}
