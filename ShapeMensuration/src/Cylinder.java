import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    double radius, height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateShape() {
        // Calculate the lateral area of the cylinder and add it to the area of the two bases
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // Calculate the circumference of the circular base
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        // Calculate the volume of the cylinder
        return Math.PI * radius * radius * height;
    }
}
