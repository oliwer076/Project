import java.util.Random;
import java.util.Scanner;

public class game {
    public void run(int max, int numberAttempt ) {

        Random random = new Random();
        int randomNumber = random.nextInt(0, max);
        System.out.println("What number will the computer give from 1 to " + max + "?");

        Scanner scanner = new Scanner(System.in);
        for (int j = 1; j < numberAttempt; j++) {
            int i = scanner.nextInt();

            if (randomNumber == i) {

                break;
            } else {
                if (randomNumber < i) {
                    System.out.println("The number you are looking for is less than yours!");
                } else {
                    System.out.println("The number you are looking for is greater than yours!");
                }
            }
        }

        System.out.println("Good shot !");
        System.out.println("CONGRATULATIONS !!!");
        System.out.println("The number you are looking for is:" + randomNumber);
        System.out.println("Game over!");
    }
}