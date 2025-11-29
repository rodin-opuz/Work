import java.util.Scanner;

public class NegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativeNum;

        do {
            System.out.println("Enter an integer - ");
            negativeNum = sc.nextInt();
        } while (negativeNum >= 0);

        System.out.println("You have entered a negatuve integer. ");
    }
}
