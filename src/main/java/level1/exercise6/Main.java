package level1.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Object> list = new ArrayList<>();
        list.add(4);
        list.add("Pere");
        list.add(5);
        list.add("Artur");
        list.add(6);
        list.add("Mortadelo");
        list.add(8);
        list.add("Filemón");
        list.add(0);
        list.add("cotxe");

        List<String> result = filterAndOrderList(list);
        System.out.println(result.toString());
    }

    private static List<String> filterAndOrderList(List<Object> list)
    {
        List<String> orderedStrings = list.stream()
                .filter(element -> element instanceof String)
                .map(element ->(String) element)
                .sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .toList();
        return orderedStrings;
    }
}
