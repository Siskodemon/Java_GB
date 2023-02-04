
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task001 {
    public static void main(String[] args) {
        Task001 task001 = new Task001();
        List<Integer> integerList = new ArrayList<Integer>();
        Integer maxCount = 10;

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < maxCount; i++) {
                integerList.add(i);
            }
        }

        System.out.println(task001.getSumOfUniqueValues(integerList));

    }

    public Integer getSumOfUniqueValues(final List<Integer> list) {
        Integer outputSUM = 0;
        Map countMap = fillMap(list);

        for (Object item : countMap.keySet()) {
            outputSUM = outputSUM + (Integer) item;
        }

        return outputSUM;
    }

    private Map fillMap(List<Integer> list) {
        Map outputMap = new HashMap();
        int fixNum = 0;
        for (Integer item : list) {
            outputMap.putIfAbsent(item, fixNum);
        }
    }
}
