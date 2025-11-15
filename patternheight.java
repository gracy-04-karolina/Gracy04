//write a program which will print a pattern of "*" 's of height "n".

import java.util.*;
public class patternheight {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
int i, j;
 
        // outer loop to handle rows
        for (i = n; i >= 1; i--) {
 
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            // printing new line for each row
            System.out.println();
        }
 
        // outer loop to handle rows
        for (i = 2; i <= n; i++) {
 
            // inner loop to handle columns
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            // printing new line for each row
            System.out.println();
        }
}
}