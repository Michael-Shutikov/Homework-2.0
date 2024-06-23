
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        circle.setFiguresColor("Зелёный");
        circle.setBordersColor("Чёрный");
        circle.info();

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setFiguresColor("Жёлтый");
        rectangle.setBordersColor("Чёрный");
        rectangle.info();

        Triangle triangle = new Triangle(7, 3, 5);
        triangle.setFiguresColor("Красный");
        triangle.setBordersColor("Чёрный");
        triangle.info();
    }
}