import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" + "Задание №1:");
        printThreeWords();

        System.out.println("Задание №2:");
        checkSumSign();

        System.out.println("Задание №3:");
        printColor();

        System.out.println("Задание №4:");
        compareNumbers();

        System.out.println("Задание №5:");
        System.out.println(checkSumRange(8, 10) + "\n");

        System.out.println("Задание №6:");
        printNumberType(-6);

        System.out.println("Задание №7:");
        System.out.println(positiveOrNegative(-8) + "\n");

        System.out.println("Задание №8:");
        typewriter("Hello World",3);

        System.out.println("\n" + "Задание №9:");
        System.out.println(leapYear(2024) + "\n");


        System.out.println("Задание №10:");
        byte[] bits = new byte[] {1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1};
            System.out.println(Arrays.toString(bits));
            for(int i = 0; i < bits.length; i++){
                if (bits[i] == 1)
                    bits[i] = 0;
                else if (bits[i] == 0)
                    bits[i] = 1;
            }  System.out.println(Arrays.toString(bits) + "\n");


        System.out.println("Задание №11:");
        int[] oneHundred = new int[100];
            for (int i = 0; i < oneHundred.length; i++) {
                oneHundred[i] = i + 1;
            }  System.out.println(Arrays.toString(oneHundred) + "\n");


        System.out.println("Задание №12:");
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(array));
            for(int i = 0; i < array.length; i++) {
                if (array[i] < 6)
                    array[i] *= 2;
            }  System.out.println(Arrays.toString(array) + "\n");


        System.out.println("Задание №13:");
        int[][] squareArray = new int[5][5];
            for (int i = 0; i < squareArray.length; i++) {
                for (int j = 0; j < squareArray.length; j++) {
                    if (i == j)
                        squareArray[i][j] = 1; }
            }
            for (int i = 0; i < squareArray.length / 2; i++) {
                for (int j = 0; j < squareArray.length; j++) {
                    int replace = squareArray[i][j];
                        squareArray[i][j] = squareArray[squareArray.length - 1 - i][j];
                        squareArray[squareArray.length - 1 - i][j] = replace; }
            }
            for (int i = 0; i < squareArray.length; i++) {
                for (int j = 0; j < squareArray.length; j++) {
                    if (i == j)
                        squareArray[i][j] = 1; }
            }
            for (int i = 0; i < squareArray.length; i++) {
                System.out.println(Arrays.toString(squareArray[i]));
            }


        System.out.println("\n" + "Задание №14:");
        System.out.println(Arrays.toString(createArray(7,11)));

    }

                        //  Задание №1
        public static void printThreeWords() {
            System.out.println("Orange, " + "\n" + "Banana, " + "\n" + "Apple." + "\n");
        }


                        //  Задание №2
        public static void checkSumSign() {
            int a = 0, b = 4;
            int sum = a + b;
            if (sum >= 0)
                System.out.println("Сумма положительная" + "\n");
            else
                System.out.println("Сумма отрицательная" + "\n");
        }


                        //  Задание №3
        public static void printColor() {
            int value = 101;
            if (value <= 0)
                System.out.println("Красный" + "\n");
            else if (value >= 1 && value <= 100)
                System.out.println("Жёлтый" + "\n");
            else
                System.out.println("Зелёный" + "\n");
        }


                        //  Задание №4
        public static void compareNumbers() {
            int a = 10, b = 11;
            if (a >= b)
                System.out.println("a >= b"+ "\n");
            else
                System.out.println("a < b" + "\n");
        }


                        //  Задание №5
        public static boolean checkSumRange(int a, int b) {
            int sum = a + b;
                if (sum >= 10 && sum <= 20)
                    return true;
                else
                    return false;
        }


                        //  Задание №6
        public static void printNumberType(int a) {
            if (a >= 0)
                System.out.println("Число положительное" + "\n");
            else
                System.out.println("Число отрицательное" + "\n");
        }


                        //  Задание №7
        public static boolean positiveOrNegative(int a) {
            if (a < 0)
                return true;
            else
                return false;
        }


                        //  Задание №8
        public static void typewriter(String printString, int howMany) {
            for (int i = 0; i < howMany; i++) {
                System.out.println(printString);
            }
        }


                        //  Задание №9
        public static boolean leapYear(int yr) {
            if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0)
                return true;
            else
                return false;
        }


                        //  Задание №14
        public static int[] createArray (int len, int initialValue) {
            int[] array = new int[len];
            for(int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            return array;
        }
}