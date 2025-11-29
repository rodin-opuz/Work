import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int integer1;
        int integer2;
        int integer3;

        System.out.println("Enter the first integer - ");
        integer1 = input.nextInt();

        System.out.println("Enter the second integer - ");
        integer2 = input.nextInt();

        System.out.println("Enter the third integer - ");
        integer3 = input.nextInt();

        System.out.println (integer1 < integer2 && integer2 < integer3);
    }
}
