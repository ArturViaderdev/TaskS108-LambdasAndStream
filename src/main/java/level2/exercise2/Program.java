package level2.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private List<Integer> list;
    public Program()
    {
        list = new ArrayList<>();
    }

    public void start()
    {
        addNumbers();
        String result = convertNumbersToString();
        System.out.println(result);
    }

    private void addNumbers()
    {
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(24);
        list.add(33);
        list.add(12);
    }

    private String convertNumbersToString()
    {
        return list.stream()
                .map(number ->(number % 2 ==0 ? "e":"o") + number)
                .collect(Collectors.joining(","));
    }


}
