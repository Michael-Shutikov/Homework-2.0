
public class Circle implements IFigure, IFigureColor {

    private double radius;
    private String figureColor;
    private String bordersColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void setFiguresColor(String figuresColor) {
        this.figureColor = figuresColor;
    }

    @Override
    public void setBordersColor(String bordersColor) {
        this.bordersColor = bordersColor;
    }

    @Override
    public void info() {
        System.out.println("\n" + "Круг:");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заливки фигуры: " + figureColor);
        System.out.println("Цвет границ фигуры: " + bordersColor);
    }
}