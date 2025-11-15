public class largestelementarray {
    public static void main(String[]args){
    int arr[] = {5,2,8,1,9};
    int largest =arr[4];
    for(int i =1;i>arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];

        }
    } 
    System.out.println(largest);
   }  

}