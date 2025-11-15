import java.util.Scanner;
public class fibonacci{
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter n:");
    int n =sc.nextInt();
    int first=0,second=1,third;
    System.out.print("fibonacci series:" +n);
    for(int i=1;i<=n;i++){
        System.out.println(first + " ");
         third =first +second;
         first =second;
        second =third;
    }

}  
}
