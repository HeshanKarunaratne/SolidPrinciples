package Principles.Solid.SingleResponsibilityAndOpenCloses;

public class AreaCalculatorOutput {
    private double totalArea;

    public AreaCalculatorOutput(double totalArea) {
        this.totalArea = totalArea;
    }

    public String json() {
        return totalArea + " in json format";
    }

    public String html() {
        return totalArea + " in html format";
    }

    public String xml() {
        return totalArea + " in xml format";
    }
}
