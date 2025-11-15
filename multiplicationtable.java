//Write a Java program to print the multiplication table of a given number up to 4
import java.util.Scanner;

public class multiplicationtable{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
// Print the multiplication table
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
in.close();
    }
}