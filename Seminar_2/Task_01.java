// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

import java.util.Scanner;

public class Task_01 {
    // Настроить проект, вывести в консоль “Hello world!”.
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String j = iScanner.nextLine();
        System.out.println("Введите искомое: ");
        String name_jewel = iScanner.nextLine();
        int stoun = 0;
        int jewels = 0;
        for (int a = 0; a < j.length(); a++) {
            for (int b = 0; b < name_jewel.length(); b++) {
                if (j.charAt(a) == name_jewel.charAt(b))
                    jewels++;
                else
                    stoun++;
            }
        }
        System.out.printf("Кол-во драгоценных камней %d",jewels);
        System.out.printf("Кол-во простых камней %d", j.length()-jewels);
    }
}

/*
 * public static void main(String[] args) {
 * String jewels = "aB";
 * String stones = "aaaAbbbB";
 * System.out.println(findJewelsInStones(jewels, stones));
 * }
 * 
 * public static String findJewelsInStones(String jewels, String stones) {
 * String outputResult = "";
 * int counter = 0;
 * for (int i = 0; i < jewels.length(); i++) {
 * for (int j = 0; j < stones.length(); j++) {
 * if (jewels.charAt(i) == stones.charAt(j)) {
 * counter++;
 * }
 * 
 * }
 * outputResult = outputResult + jewels.charAt(i) + counter;
 * counter = 0;
 * }
 * return outputResult;
 * }
 */