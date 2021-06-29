package SOLID.open_closed_principle;

import SOLID.open_closed_principle.shapes.Circle;
import SOLID.open_closed_principle.shapes.Shape;
import SOLID.open_closed_principle.shapes.Square;

public class AreaCalculator {

    public static void main(String [] args){

        Shape circle = new Circle(10.6f);
        Shape square = new Square(10.3f, 5.6f);

        displayCalculations(circle);
        displayCalculations(square);
    }
    public static void displayCalculations(Shape shape){
        shape.calcArea();
        shape.calcLength();
    }
}
