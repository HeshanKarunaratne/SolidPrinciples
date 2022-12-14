package Principles.Solid.InterfaceSegregation;

public class Cube implements SolidShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
