import java.util.Scanner;
public class sumofprime {
 public static int primeSum(int x ,int y) {
  
   int sum = 0;
   int flag = 0 ;
        for (int i = x; i <= y; i++) {
           flag = 0;
          for (int j = 2; j <= i/2; j++) {
            if(i % j== 0){
              flag++;
            }
          }
          if (flag == 0){
            sum += i;
          }
        }
   return sum;
 }
          
public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
		
	    System.out.println(primeSum(x, y));
	}
}
    

