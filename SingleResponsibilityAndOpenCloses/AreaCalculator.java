package Principles.Solid.SingleResponsibilityAndOpenCloses;

public class AreaCalculator {
    private Shape[] shape;

    public AreaCalculator(Shape[] shape) {
        this.shape = shape;
    }

    public double calculateTotalArea() {
        double sum = 0.0;

        for (int i = 0; i < shape.length; i++) {
            sum += shape[i].area();
        }
        return sum;
    }


}
