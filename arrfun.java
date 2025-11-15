//print largest and smallest in array usinfg functions
import java.util.Scanner;
public class arrfun {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int[]arr=new int[5];
        //System.out.println("array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest =arr[4]/*arr[0] */,smallest = arr[0] ;
           for(int i =1;i<n;i++){
        if(arr[i]<smallest){
            smallest =arr[i];
              
        }else if(arr[i]>largest){
            largest =arr[i];
        }
    }
            System.out.println("smallest:" +smallest);
            System.out.println("largest:" + largest);
        

     }
 }

    

        