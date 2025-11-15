import java.util.Scanner;
public class palindromeone{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
       
            int n =sc.nextInt();
            
            int temp=n,rev =0;
            while(n!=0){
                int digit =n%10;
                rev=rev*10+digit;
                n/=10;
            }
            if (temp==rev){
                System.out.println( temp + "palindrome");
            }else{
                System.out.println( temp + "not a palindrome");
            }

        }

    }
    

