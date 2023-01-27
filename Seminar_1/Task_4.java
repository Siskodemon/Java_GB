import java.util.Random;

public class Task_4 {

        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
        // количество подряд идущих 1.
        public static void main(String[] args) {

        }

        public int count(int[] array) {
            int count = 0;
            Random random = new Random();
            for(int i = 0; i < 10;i++){
                array[i] = random.nextInt(2);
                System.out.append("\n Значение x: " + array[i]);
            }
            return count;
            
            
        }
}

/*
public class Task3 {
    // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
    // количество подряд идущих 1.
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        System.out.println(count_arr(array));

    }

    public static int count_arr(int[] array) {
        int count = 0;
        int tempCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                tempCount++;
            else if (tempCount > count) {
                count = tempCount;
                tempCount = 0;
            }
        }
        return count > tempCount ? count : tempCount;
    }
}
*/