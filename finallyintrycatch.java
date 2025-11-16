import java.util.Scanner;
public class finallyintrycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {

System.out.println("Result is: " + num1 / num2 );
} catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            // Print final message, runs always
            System.out.println("Program Ended");
        }

        sc.close();
    }
}
    

