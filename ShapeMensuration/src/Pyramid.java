import java.util.Scanner;

public class Pyramid extends Shape implements Volume {

    // instance variables
    double baseLength, baseWidth, height;

    // setters for instance variables
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // method to calculate the area of the pyramid's base
    @Override
    public double calculateShape() {
        return baseLength * baseWidth;
    }

    // method to calculate the perimeter of the pyramid's base
    @Override
    public double calculatePerimeter() {
        return 4 * Math.sqrt(Math.pow(baseLength/2, 2) + Math.pow(height, 2));
    }

    // method to calculate the volume of the pyramid (required by the Volume interface)
    @Override
    public double calculateVolume() {
        return (baseLength * baseWidth * height) / 3;
    }
}
