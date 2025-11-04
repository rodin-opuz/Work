import java.util.Scanner;
public class Divide{
    public static void main(String[] args){
         int n, r;
         Scanner sc = new Scanner (System.in);
         System.out.println("Choose an integer");
         n = sc.nextInt();
         r = 42/n;
         System.out.println("The result is:" + r );
     }
}