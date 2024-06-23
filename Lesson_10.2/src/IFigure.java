
public interface IFigure {

    default double perimeter() {
        return 0;
    }
    double area();
    void info ();
}