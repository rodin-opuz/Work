import java.util.Scanner;

public class MeanComparison {
    public static void main(String[] args) {
        double first = arithmeticMean(17, 43);
        double second = geometricMean(17, 43);

        System.out.println(first > second);
    }

    public static double arithmeticMean(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double geometricMean(int a, int  b) {
        return Math.sqrt(a * b);
    }
}
