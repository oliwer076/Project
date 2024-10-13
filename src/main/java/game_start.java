import java.util.Scanner;

public class game_start {
    public static void main(String[] args) {

        System.out.println("Enter maximum range: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        System.out.println("Enter number of attempts:");
        int nubmerAttempt = scanner.nextInt();
        game gra = new game();
        gra.run(max, 5);
    }
}
