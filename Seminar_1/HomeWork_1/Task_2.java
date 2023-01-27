package HomeWork_1;
/*
Task2
Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число > ");
        Integer ArrayLengt = scanner.nextInt();
        Integer max = 300;
        Integer[] array = new Integer[ArrayLengt];
        Integer count = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        Integer buff = 0;
        while(count-1 != 0){
        for (int i = 0; i < count-1; i++) {
            if(array[i+1]<array[i]){
                buff = array[i];
                array[i] = array[i+1];
                array[i+1] = buff;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        --count;
        }
    }
}
