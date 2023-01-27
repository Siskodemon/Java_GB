import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Task_4 {
    public static void main(String[] args) {
        findMAX(generateArray());
    }

    private static void findMAX(Integer[][] generateArray) {
        int max = 0;
        for (int i = 0; i < generateArray.length; i++) {
            for (int j = 0; j < generateArray[0].length; j++) {
                if (generateArray[i][j] > max) {
                    max = generateArray[i][j];
                }
            }

        }
        System.out.println();
        System.out.printf("Максимальный элемент этого массива равен %d", max);
    }

    private static Integer[][] generateArray() {
        int ROWS = 5;
        int COLLUMS = 8;
        Random rnd = new Random();
        Integer[][] array = new Integer[ROWS][COLLUMS];
        Integer MIN = -99;
        Integer MAX = 99;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLLUMS; j++) {
                array[i][j] = rnd.nextInt((MAX - MIN) + 1) + MIN;
            }
        }
        printMatrix(array);
        return array;
    }

    private static void printMatrix(Integer[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}
