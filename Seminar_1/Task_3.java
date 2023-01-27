import java.util.Scanner;

public class Task_3 {
   // В консоли запросить имя пользователя. В зависимости от текущего времени,
    // вывести приветствие вида
    // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.println("Задайте время (часы):");
        int hours = iScanner.nextInt();
        System.out.println("Задайте время (минуты):");
        int mins = iScanner.nextInt();

        if ((hours > 4 && mins > -1) || (hours < 12 && mins < 60)) {
            System.out.printf("Доброе утро, %s", name);
        } else if ((hours > 11 && mins > -1) || (hours < 18 && mins < 60)) {
            System.out.printf("Добрый день, %s", name);
        } else if ((hours > 17 && mins > -1) || (hours < 23 && mins < 60)) {
            System.out.printf("Добрый вечер, %s", name);
        } else if ((hours > 22 && mins > -1) || (hours < 5 && mins < 60))
            System.out.printf("Доброй ночи", name);
    }
}

