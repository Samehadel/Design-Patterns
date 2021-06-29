package SOLID.open_closed_principle.shapes;

public class Circle implements Shape{
    private float diameter;

    public Circle(float diameter){
        this.diameter = diameter;
    }

    @Override
    public float calcArea() {
        float r = diameter / 2;
        float area = (22 / 7) * r * r;

        System.out.println("Calc Area of Circle: " + area);
        return area;
    }

    @Override
    public float calcLength() {
        float r = diameter / 2;
        float length = 2 * (22 / 7) * r;

        System.out.println("Calc Length of Circle: " + length);
        return length;
    }
}
