import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] arr1 = new String[][]{
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"}
        };

        String[][] arr2 = new String[][]{
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"},
                {"4", "4", "X", "4"},
                {"4", "4", "4", "4"}
        };

        String[][] arr3 = new String[][]{
                {"3", "3", "3"},
                {"3", "3", "3"},
                {"3", "3", "3"}
        };

        System.out.println("\n" + "Выводим цифровой массив 4х4:");
        printArr(arr1);

        System.out.println("\n" + "Выводим цифровой массив 4х4 с буквой:");
        printArr(arr2);

        System.out.println("\n" + "Выводим цифровой массив 3х3:");
        printArr(arr3);
    }

    public static void printArr(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            try {
                throw new MyArraySizeException();
            } catch (MyArraySizeException e) {
                System.out.println("Недопустимый размер массива.");
                System.out.println("Допустимый размер - 4х4.");
            }
        }else
            for (int i = 0; i < arr.length; i++)
                System.out.println(Arrays.toString(arr[i]));

        try {
            int sum = 0;
            if (arr.length == 4 || arr[0].length == 4) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++)
                        try {
                            sum += Integer.parseInt(arr[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                }
                System.out.println("Сумма всех ячеек в массиве: " + sum);
            }
        } catch (MyArrayDataException e) {
            System.out.println("Не удалось посчитать сумму всех ячеек.");
            System.out.println("В ячейке с индексом: [" + e.i + "][" + e.j + "] содержится не числовое значение.");
        }
    }
}




