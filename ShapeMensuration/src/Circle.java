// Import the Scanner class to get input from the user
import java.util.Scanner;

// Declare the Circle class and extend it from the Shape class
public class Circle extends Shape {

    // Declare a variable to store the radius of the circle
    double radius;

    // Define a method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override the calculateShape method to calculate the area of the circle
    @Override
    public double calculateShape() {
        return Math.PI * radius * radius;
    }

    // Override the calculatePerimeter method to calculate the circumference of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
