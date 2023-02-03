package HomeWork;

import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Task_1 {

    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        LinkedList<Integer> array = new LinkedList<Integer>();
        array = InputArray();
        array = removeEvenValue(array);
        System.out.printf("Минимальный элемент массива - %d\n",getMin(array));
        System.out.printf("Максимальный элемент массива - %d\n", getMax(array));
        System.out.printf("Среднее арефметичекое элементов массива - %f", getAverage(array));
    }

    public  static LinkedList<Integer> InputArray() throws NumberFormatException {
            int count = 0; 
            Boolean logout = false;
            Scanner input = new Scanner(System.in);
            LinkedList<Integer> list = new LinkedList<Integer>();
            while (logout == false) {
                System.out.println("Введите число в массив напишите слово СТОП: ");
                try {
                    count = Integer.parseInt(input.nextLine());
                    list.add(count);
                    System.out.println(list);
                    logout = false;
                } 
                catch (NumberFormatException e) {
                    System.out.println("Ввод даных закончен. Полученный массив: ");
                    System.out.println(list);
                    System.out.println();
                    logout = true;
             }
            }
            return list;

    }
    // Нужно удалить из него четные числа
    public static LinkedList<Integer> removeEvenValue(LinkedList<Integer> list) {
        ListIterator<Integer> itr = list.listIterator();
        while(itr.hasNext()){
            if(itr.next()%2 == 0) itr.remove();;
        }
        System.out.println("Выполнено удаление чётных значений массива. Результат:");
        System.out.println(list);
        System.out.println();
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(LinkedList<Integer> list) {
        ListIterator<Integer> itr = list.listIterator();
        int min = itr.next();
        int count = 0;
        while (itr.hasNext()) {
            count = itr.next();
            if ( count < min) min = count;
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(LinkedList<Integer> list) {
        ListIterator<Integer> itr = list.listIterator();
        int max = itr.next();
        int count = 0;
        while (itr.hasNext()) {
            count = itr.next();
            if (count > max)
                max = count;
        }
        return max;
    }

    // Найти среднее значение
    public static Double getAverage(LinkedList<Integer> list) {
        ListIterator<Integer> itr = list.listIterator();
        int sum = 0;
        int count = 0;
        while (itr.hasNext()) {
            sum = sum + itr.next();
            count++;
        }
        double result = sum/count;
        return result;
    }
}