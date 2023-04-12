// Import the Scanner class to get input from the user
import java.util.Scanner;

// Declare the Rectangle class and extend it from the Shape class
public class Rectangle extends Shape {
    // Declare a variable to store the length and width of rectangle
    double length, width;

    // Define a method to set the length of the rectangle
    public void setLength(double length) {
        this.length = length;
    }
    // Define a method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }
    // Override the calculateShape method to calculate the area of the rectangle
    @Override
    public double calculateShape() {
        return length * width;
    }
    // Override the calculatePerimeter method to calculate the perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
