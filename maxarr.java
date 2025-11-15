//Finding the Maximum Element in an Array
import java.util.Scanner;

public class maxarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];  // Assume first element is maximum
for (int i = 1; i < n; i++) {
    if (arr[i] > max) {
        max = arr[i];  // Update maximum if current element is larger
    }
}


System.out.println("Maximum is: " + max);

        sc.close();
    }
}
