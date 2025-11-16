public class secondlargeelement {
    public static void main(String[] args) {
        int[] arr = {10,20,4,45,99};
        int secondlargest=arr [3];
        for(int i=1;i>arr.length;i++){
            if(arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("second largest:"+secondlargest);
    }
}
    

