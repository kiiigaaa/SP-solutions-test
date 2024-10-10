package Problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public static List<Object> combineAlternating(List<?> list1, List<?> list2) {
        List<Object> result = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if (list1.size() > list2.size()) {
            result.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > list1.size()) {
            result.addAll(list2.subList(size, list2.size()));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        List<Object> combined = combineAlternating(list1, list2);

        System.out.println(combined);
    }
}
