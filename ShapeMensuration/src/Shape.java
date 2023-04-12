// Declare the Shape abstract class
public abstract class Shape {

    // Declare two abstract methods to calculate the area and perimeter of a shape
    public abstract double calculateShape();
    public abstract double calculatePerimeter();

    // Define a non-abstract method to display the selected shape
    public void showShape(String shape) {
        System.out.println("Shape selected: " + shape);
    }
}
