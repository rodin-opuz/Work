import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter Integer - ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
