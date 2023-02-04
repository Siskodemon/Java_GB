import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Task_2 {
    // Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
    // в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(sum(d1,d2));
        // result [6,6,0,1]

    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> d3 = new ArrayDeque<>();
        int d_buf = 0;
        do {
            d_buf = d1.getLast()+ d2.getLast();
            if(d_buf>9){
                while(d_buf > 9){
                    d3.addFirst(d_buf/10);
                    d_buf %= 10;
                }
                d3.addFirst(d_buf);
            }
            else d3.addFirst(d_buf);
            d1.removeLast();
            d2.removeLast();
            }
            while ((d1.isEmpty() != true) | (d2.isEmpty() != true));
        return d3;
    }
}
