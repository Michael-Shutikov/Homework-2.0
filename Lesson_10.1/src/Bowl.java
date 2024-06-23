
public class Bowl {

    private static int food;

    public Bowl(int food) {
        setFood(food);
        info();
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public static void info() {
        System.out.println("\n" + "В миске: " + food + " грамм корма.");
    }
}
