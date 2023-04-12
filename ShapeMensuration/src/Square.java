import java.util.Scanner;

public class Square extends Shape {
    double side; // declares the instance variable 'side' of type double

    public void setSide(double side) { // setter method to set the value of 'side'
        this.side = side; // assigns the parameter value to the 'side' instance variable using the 'this' keyword
    }

    @Override
    public double calculateShape() { // overrides the abstract method 'calculateShape' of the superclass 'Shape'
        return side * side; // returns the area of the square calculated as the product of 'side' and itself
    }

    @Override
    public double calculatePerimeter() { // overrides the abstract method 'calculatePerimeter' of the superclass 'Shape'
        return 4 * side; // returns the perimeter of the square calculated as four times the value of 'side'
    }
}
