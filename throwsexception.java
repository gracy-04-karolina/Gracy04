import java.util.Scanner;
public class throwsexception {
        public static double calculateSquareRoot(double num) throws Exception {
if(num<0){
  throw new Exception("Negative Number");
}
return Math.sqrt(num);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        try {
            double result = calculateSquareRoot(number);
            System.out.println("Square root is: " + result);
        } catch (Exception e) {
            System.out.println("Cannot calculate square root of negative number");
        }

        sc.close();
    }
}
    
