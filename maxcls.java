class Maximum{
    int num1;
    int num2;
    public Maximum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void display(){
        int max = (num1>num2)?num1:num2;
        System.out.println("The Maximum:"+max);
    }
}
public class maxcls{
    public static void main(String[] args) {
        Maximum n = new Maximum(5,10);
        n.display();
    }
}
    

