// Importing the Scanner class is not necessary in this class, so it can be removed
// from the import statements.

public class Sphere extends Shape implements Volume {
    double radius;

    // Setter method for setting the radius of the sphere.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculateShape method from the Shape abstract class.
    // Calculates the surface area of the sphere using the formula: 4 * pi * r^2
    @Override
    public double calculateShape() {
        return 4 * Math.PI * radius * radius;
    }

    // Implementation of the calculatePerimeter method from the Shape abstract class.
    // The perimeter of a sphere is not defined, so this method returns 0.
    @Override
    public double calculatePerimeter() {
        return 0;
    }

    // Implementation of the calculateVolume method from the Volume interface.
    // Calculates the volume of the sphere using the formula: (4/3) * pi * r^3
    @Override
    public double calculateVolume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}
