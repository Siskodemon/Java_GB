import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "2a", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }

    public static void printResultOfCheck(List<String> list) {
        for (String item : list) {
            if (isDigit(item)) {
                System.out.println(item + " is digit.");
            } else
                System.out.println(item + " is String.");
        }
    }

    public static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
