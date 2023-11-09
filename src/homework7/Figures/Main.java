package homework7.Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(2, 6, 7);
        figures[1] = new Rectangle(8, 12);
        figures[2] = new Circle(33);
        figures[3] = new Rectangle(78, 11);
        figures[4] = new Circle(4);

        figures[0].getPerimeter();
        System.out.println("Perimeter 1: " + figures[0].getPerimeter());
        figures[0].getArea();
        System.out.println("Area 1: " + figures[0].getArea());

        figures[1].getPerimeter();
        System.out.println("Perimeter 2: " + figures[1].getPerimeter());
        figures[1].getArea();
        System.out.println("Area 2: " + figures[1].getArea());

        figures[2].getPerimeter();
        System.out.println("Perimeter 3: " + figures[2].getPerimeter());
        figures[2].getArea();
        System.out.println("Area 3: " + figures[2].getArea());

        figures[3].getPerimeter();
        System.out.println("Perimeter 4: " + figures[3].getPerimeter());
        figures[3].getArea();
        System.out.println("Area 4: " + figures[3].getArea());

        figures[4].getPerimeter();
        System.out.println("Perimeter 5: " + figures[4].getPerimeter());
        figures[4].getArea();
        System.out.println("Area 5: " + figures[4].getArea());

        System.out.println("----------------");
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.getPerimeter();
        }
        System.out.println("Total Perimeter: " + totalPerimeter);
    }
}
