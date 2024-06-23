
abstract class Animal {

    private static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected void run(int distance) {
        System.out.println("Зверь бежит");
    }

    protected void swim(int distance) {
        System.out.println("зверь плывёт");
    }
}
