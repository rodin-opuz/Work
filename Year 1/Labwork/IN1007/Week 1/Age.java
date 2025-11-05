import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current year - ");
        int currentYear = sc.nextInt();

        System.out.println("Enter your birth year - ");
        int birthYear = sc.nextInt();

        int age = currentYear - birthYear;

        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}