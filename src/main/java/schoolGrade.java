import java.util.Scanner;

public class schoolGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of points? (0-100)");
        int points = scanner.nextInt();

        if (points > 100 || points < 0) {
            System.out.println("This value is incorrect!");
        }
        if (points >= 90) {
            System.out.println("Your result is: 5");
        } else if (points >= 80) {
            System.out.println("Your result is: 4");
        } else if (points >= 70) {
            System.out.println("Your result is: 3");
        } else if (points >= 60) {
            System.out.println("Your result is: 2");
        } else {
            System.out.println("Your result is: 1");
        }
    }
}
