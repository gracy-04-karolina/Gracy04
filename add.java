  class additioncls {
    int num1;
    int num2;

    public int add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        return num1 + num2;  // return sum
    }

    public void display() {
        System.out.println(num1 + num2);
    }
}

public class add {
    public static void main(String[] args) {
        additioncls a = new additioncls();
        int result = a.add(10, 20);
        System.out.println("The sum is: " + result);

        // Optional: call display()
        a.display();
    }
}
  
    
