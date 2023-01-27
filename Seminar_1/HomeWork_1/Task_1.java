package HomeWork_1;
/*Task1
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите чётное положительное число > ");
        Integer ArrayLengt = scanner.nextInt();
        //Random rnd = new Random();
        Integer max = 300;
        Integer max_count = 0;
        Integer min_count = 300;
        Integer[] array = new Integer[ArrayLengt];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
            if (array[i] > max_count) max_count = array[i];
            if (array[i] < min_count) min_count = array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальное значение: " + max_count);
        System.out.println("Минимальное значение: " + min_count);
        System.out.println("Среднее значение: " + (min_count+max_count)/2);
        //return array;
    }

}
