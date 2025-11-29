import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstInteger;
        int secondInteger;

        System.out.println("Enter 1st Integer - ");
        firstInteger = sc.nextInt();

        System.out.println("Enter 2nd Integer - ");
        secondInteger = sc.nextInt();

        if (firstInteger > secondInteger) {
            System.out.println("greater");
        } else {
            System.out.println("smaller or equal");
        }
    }
}
