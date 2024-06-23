
public class Cat extends Animal {

    private String name;
    private static int count;
    private int appetite;
    private final boolean hungry = true;

    public Cat(String name, int appetite) {
        setName(name);
        setAppetite(appetite);
        isHungry();
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    @Override
    public void run(int distance) {
        if (distance > 200)
            System.out.println("Кот " + name + " не может пробежать " + distance + " метров.");
        else if (distance <= 0)
            System.out.println("Кот " + name + " никуда не бежит.");
        else
            System.out.println("Кот " + name + " пробежал: " + distance + " метров.");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать.");
    }
}
