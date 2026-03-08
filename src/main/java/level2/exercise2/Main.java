package level2.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(24);
        list.add(33);
        list.add(12);
        String result = convertNumbersToString(list);
        System.out.println(result);
    }

    private static String convertNumbersToString(List<Integer> list)
    {
        return list.stream()
                .map(number ->(number % 2 ==0 ? "e":"o") + number)
                .collect(Collectors.joining(","));
    }
}
