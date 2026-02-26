package practical;
import java.util.Scanner;

public class Exp_4 {

    static void printExp_4(int n) {
        if (n <= 0) {
            System.out.println("Nothing to print");
            return;
        }
        long a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i == n - 1 ? "\n" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2462602");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();     
        printExp_4(n);            

        System.out.print("Enter an Integer to Test Even/odd: ");
        int x = sc.nextInt();
        System.out.println(x + (x % 2 == 0 ? " is even" : " is odd"));

        sc.close();
    }
}