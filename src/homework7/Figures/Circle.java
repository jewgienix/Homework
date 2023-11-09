package homework7.Figures;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.141519;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.141519 * radius;
    }
}
