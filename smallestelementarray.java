public class smallestelementarray {
    public static void main(String[]args){
        int[]arrays = {5,2,8,1,9};
        int smallest = arrays[0];
        for(int i=1;i<arrays.length;i++){
            if(arrays[i]<smallest){
                smallest=arrays[i];
            }
        }
        System.out.println("smallest element:"+smallest);
    }
}
    
