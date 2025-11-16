 import java.util.Scanner;
public class temperature {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter temp" );
         double temp = sc.nextDouble();
         if(temp >=100 ){
            System.out.print("fever");
         }

    }
} 
