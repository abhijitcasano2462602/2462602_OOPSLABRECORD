package practical;
import java.io.*;

class MyCheckedException extends Exception {w
    MyCheckedException(String msg) { 
        super(msg); 
    }
}

public class ExceptionHandling {

   
    static void mayThrowChecked(boolean throwIt) throws MyCheckedException {
        if (throwIt) 
            throw new MyCheckedException("Checked exception thrown!");
    }

   
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        try {
            System.out.println("REG NO:2462602");
            System.out.println("divide 10 by 2 = " + divide(10, 2));
            System.out.println("divide 10 by 0 = (next)");
            System.out.println("result = " + divide(10, 0));  

        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae.getMessage());

        } catch (RuntimeException re) {
            System.out.println("Other runtime Exception: " + re);

        } finally {
            System.out.println("finally always runs");
        }

        
        try {
            mayThrowChecked(true);

        } catch (MyCheckedException e) {
            System.out.println("Caught custom checked exception: " + e.getMessage());
        }

        
        try (BufferedReader br = new BufferedReader(new StringReader("line1\nline2"))) {
            System.out.println("first line: " + br.readLine());

        } catch (IOException ioe) {
            System.out.println("IO error: " + ioe.getMessage());
        }

        System.out.println("Program Finished");
    }
}