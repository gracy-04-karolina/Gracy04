public class sumofelementarr {
    public static void main(String[]args){
        int arr[]={5,2,8,1,9};
        int sum=0;
        for(int n:arr){
            while(n>0){
            sum = sum + (n%10);
            n = n/10;
        }
     }
     System.out.println(sum);
    
   }   
 }
