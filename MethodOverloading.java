import java.util.Scanner;
public class MethodOverloading {
       static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }
 int add(int a, int b, int c) {
        return a + b + c;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Calculator c = new Calculator();

        int sumTwo = c.add(a, b);
        System.out.println("Sum of two numbers: " + sumTwo);

        int sumThree = c.add(x, y, z);
        System.out.println("Sum of three numbers: " + sumThree);

        sc.close();
    }
 }
