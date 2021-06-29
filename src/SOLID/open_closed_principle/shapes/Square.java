package SOLID.open_closed_principle.shapes;

public class Square implements Shape{

    private float length;
    private float width;

    public Square(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float calcArea() {
        float area = length * width;
        System.out.println("Calc Area of Square: " + area);

        return area;
    }

    @Override
    public float calcLength() {
        float length = this.length * 2 + this.width * 2;
        System.out.println("Calc Length of Square: " + length);

        return length;
    }
}
