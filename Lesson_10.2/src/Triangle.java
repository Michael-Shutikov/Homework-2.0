
public class Triangle implements IFigure, IFigureColor {

    private double hypotenuse;
    private double leg1;
    private double leg2;
    private String figuresColor;
    private String bordersColor;

    public Triangle(double hypotenuse, double leg1, double leg2) {
        this.hypotenuse = hypotenuse;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double perimeter() {
        return hypotenuse + leg1 + leg2;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - hypotenuse) * (p - leg1) * (p - leg2));
    }

    @Override
    public void setFiguresColor(String figuresColor) {
        this.figuresColor = figuresColor;
    }

    @Override
    public void setBordersColor(String bordersColor) {
        this.bordersColor = bordersColor;
    }

    @Override
    public void info() {
        System.out.println("\n" + "Треугольник:");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заливки фигуры: " + figuresColor);
        System.out.println("Цвет границ фигуры: " + bordersColor);
    }
}