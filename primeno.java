import java.util.Scanner;
public class primeno {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no:");
        int n =sc.nextInt();
        boolean isprime = true;
        if(n<=1){
            isprime =false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
          }      
    if(isprime){
        System.out.print("prime no.");
    }else{
        System.out.print("not a prime no.");

      }
    }
}
