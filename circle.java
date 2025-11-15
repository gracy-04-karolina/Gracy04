//Declare a class called Circle with one member variable radius.
//Write a constructor for Circle that takes radius as a parameter and assigns it using the this keyword.
//In the main method, create an object of Circle and print its radius.


import java.util.Scanner;

public class circle{

    // Declare a separate class named Circle
    static class Circle {

        int radius;
Circle(int radius) {
    this.radius = radius; // Assign the parameter to the instance variable using 'this'
}
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read radius value from user
        int r = sc.nextInt();

        // Create an object of Circle class using constructor
        Circle c = new Circle(r);

        // Print the radius using object member
        System.out.println("Radius of the circle is: " + c.radius);

        sc.close();
    }
}