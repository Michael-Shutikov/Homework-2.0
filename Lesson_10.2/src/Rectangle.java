
public class Rectangle implements IFigure, IFigureColor {

    private double width;
    private double length;
    private String figureColor;
    private String bordersColor;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public double area() {
        return width * length;
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
        System.out.println("\n" + "Прямоугольник:");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заливки фигуры: " + figureColor);
        System.out.println("Цвет границ фигуры: " + bordersColor);
    }
}