package Principles.Solid.SingleResponsibilityAndOpenCloses;

public class App {
    public static void main(String[] args) {


        Square square = new Square(5);
        Shape[] arr = new Shape[] {  square };

        AreaCalculator areaCalculator = new AreaCalculator(arr);
        double totalArea = areaCalculator.calculateTotalArea();

        AreaCalculatorOutput areaCalculatorOutput = new AreaCalculatorOutput(totalArea);
        System.out.println(areaCalculatorOutput.json());
        System.out.println(areaCalculatorOutput.html());
        System.out.println(areaCalculatorOutput.xml());

    }
}
