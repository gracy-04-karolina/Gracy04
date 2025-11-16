public class Student {
    String name;
    int age;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("national model");
System.out.println("name" +name);
System.out.println("age" +age);
    }
}
class Main{
public static void main(String[]args){
    Student s = new Student("Joy",18);
    s.display();
   }
}
    

