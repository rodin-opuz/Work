//Exercise 8

import java.util.Scanner;

public class StringPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String word = sc.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(word.equals(reversed));
    }
}
