 import java.util.Scanner;
 public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int temp = n,sum = 0;
        while(n!=0){
            int digit = n%10;
            sum+=digit*digit*digit;
            n/=10;
        } 
        if(temp==sum){
            System.out.println(temp+"Armstrong");
        }
        else{
            System.out.println(temp+"Not a Armstrong");
        }
     }
    
}
    

