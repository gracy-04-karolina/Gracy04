import java.util.Scanner;
public class methfun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        Sum(num);
        count(num);
        Palindrome(num);

    }
        public static void Sum(int n){
            int Sum = 0;
            while(n>0){
                Sum+=n%10;
                n/=10;
             }
             System.out.println(Sum);
            }
             public static int count(int n){
                int count=0;
                while(n>0){
                    count++;
                    n=n/10;
                }
                    return count;
            }
                public static void Palindrome(int n){
                    int temp=n,rev=0;
                    while(n!=0){
                        int digit=n%10;
                        rev=rev*10+digit;
                        n/=10;
                    }
                    if(temp==rev){
                        System.out.println(temp+"Palindrome");
                    }
                    else{
                        System.out.println(temp+"Not Palindrome");
                    }

                }
                

             }
        



        
    
    

