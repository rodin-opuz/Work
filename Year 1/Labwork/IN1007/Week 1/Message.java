import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name - ");
        name_of_the_student = input.nextLine();

        System.out.println("Enter your TA - ");
        name_of_the_TA = input.nextLine();

        System.out.println("Dear " + name_of_the_TA + ",\nI enjoy your tutorials, they are awesome!\n" + name_of_the_student + ".");
    }
}
