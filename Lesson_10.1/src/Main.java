
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Cat catBarsik = new Cat("Барсик",10);
        Cat catFelix = new Cat("Феликс",10);
        Dog dogSharik = new Dog("Шарик");
        Dog dogBobik = new Dog("Бобик");

        catBarsik.run(300);
        catFelix.swim(10);
        dogSharik.run(500);
        dogBobik.swim(10);

        Cat[] hungryCats = new Cat[3];
        hungryCats[0] = new Cat("Борис", 10);
        hungryCats[1] = new Cat("Мурлыка",15);
        hungryCats[2] = new Cat("Обжорка", 100);

        Bowl bowl = new Bowl(100);
        for (int i = 0; i < hungryCats.length; i++) {
            if (hungryCats[i].isHungry() == true && hungryCats[i].getAppetite() < bowl.getFood())
                System.out.println("Кот " + hungryCats[i].getName() + " наелся.");
            else
                System.out.println("Кот " + hungryCats[i].getName() + " не наелся. В миске не хватило корма.");
        }

        System.out.println("\n" + "Создали животных: " + Animal.getCount());
        System.out.println("Создали котов: " + Cat.getCount());
        System.out.println("Создали собак: " + Dog.getCount());
    }
}