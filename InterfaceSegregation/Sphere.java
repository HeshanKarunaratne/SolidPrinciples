package Principles.Solid.InterfaceSegregation;

public class Sphere implements SolidShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4 / 3) * 3.14 * radius * radius * radius;
    }
}
