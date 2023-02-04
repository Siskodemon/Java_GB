import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_1 {
    // Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,2,1));
    
    if(checkOn(deque) == true) System.out.println("Чисоя яв-ся полиндромом");
    else 
        System.out.println("Чисоя не яв-ся полиндромом");
}

public static boolean checkOn(Deque<Integer> deque){
    do {
        if (deque.getFirst() == deque.getLast()) {
            deque.removeFirst();
            deque.removeLast();
        } else {
            return false;
        }
    } while ((deque.isEmpty() != true) & (deque.size()==1));
    return true;
}
}

