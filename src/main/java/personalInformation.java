import java.util.Scanner;

public class personalInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hi " + name + " ! " + "You have " + age + " yers old.");
    }
}
