import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current year - ");
        int currentYear = input.nextInt();

        System.out.println("Enter your birth year - ");
        int birthYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is " + age);
    }
}
