/* Name: Smriti Sinha
PRN: 21070126090
Branch: AI/ML-B1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop to allow the user to enter shapes until they choose to exit
        while (true) {
            System.out.println("Enter the name of the shape (or type exit to end the program): ");
            String shapeName = scanner.next();

            // Check if the user entered "exit" to end the program
            if (shapeName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            Shape shape = null;
            // Determine the shape entered by the user and create an instance of that shape
            switch (shapeName.toLowerCase()) {
                case "circle":
                    shape = new Circle();
                    System.out.print("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    ((Circle) shape).setRadius(radius);
                    break;
                case "rectangle":
                    shape = new Rectangle();
                    System.out.print("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width: ");
                    double width = scanner.nextDouble();
                    ((Rectangle) shape).setLength(length);
                    ((Rectangle) shape).setWidth(width);
                    break;
                case "square":
                    shape = new Square();
                    System.out.print("Enter the side length: ");
                    double side = scanner.nextDouble();
                    ((Square) shape).setSide(side);
                    break;
                case "sphere":
                    shape = new Sphere();
                    System.out.print("Enter the radius: ");
                    double sphereRadius = scanner.nextDouble();
                    ((Sphere) shape).setRadius(sphereRadius);
                    break;
                case "cylinder":
                    shape = new Cylinder();
                    System.out.print("Enter the radius: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double cylinderHeight = scanner.nextDouble();
                    ((Cylinder) shape).setRadius(cylinderRadius);
                    ((Cylinder) shape).setHeight(cylinderHeight);
                    break;
                case "pyramid":
                    shape = new Pyramid();
                    System.out.print("Enter the base length: ");
                    double pyramidBaseLength = scanner.nextDouble();
                    System.out.print("Enter the base width: ");
                    double pyramidBaseWidth = scanner.nextDouble();
                    System.out.print("Enter the height: ");
                    double pyramidHeight = scanner.nextDouble();
                    ((Pyramid) shape).setBaseLength(pyramidBaseLength);
                    ((Pyramid) shape).setBaseWidth(pyramidBaseWidth);
                    ((Pyramid) shape).setHeight(pyramidHeight);
                    break;
                default:
                    // Display an error message if the user enters an invalid shape name
                    System.out.println("Invalid shape name!");
                    continue;
            }

            // Call the methods of the selected shape to display its details
            shape.showShape(shapeName);
            System.out.println("Area: " + shape.calculateShape());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            // Check if the shape implements the Volume interface, and if so, display its volume
            if (shape instanceof Volume) {
                System.out.println("Volume: " + ((Volume) shape).calculateVolume());
            }

            System.out.println("------------------------------");
        }
    }
}
