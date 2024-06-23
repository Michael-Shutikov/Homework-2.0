
public class Dog extends Animal {

    private String name;
    private static int count = 0;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance > 500)
            System.out.println("Пёс " + name + " не может пробежать " + distance + " метров.");
        else if (distance <= 0)
            System.out.println("Пёс " + name + " никуда не бежит.");
        else
            System.out.println("Пёс " + name + " пробежал: " + distance + " метров.");
    }

    @Override
    public void swim(int distance) {
        if (distance > 10)
            System.out.println("Пёс " + name + " не моежт проплыть " + distance + " метров.");
        else if (distance <= 0)
            System.out.println("Пёс " + name + " не плавает.");
        else
            System.out.println("Пёс " + name + " проплыл: " + distance + " метров.");
    }
}
