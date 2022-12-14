package Principles.Solid.InterfaceSegregation;

public class Cuboid implements Shape {
    private double height;
    private double width;
    private double length;

    public Cuboid(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double volume() {
        return height * width * length;
    }

    @Override
    public double area() {
        return 2 * (width * length + width * height + length * height);
    }
}
