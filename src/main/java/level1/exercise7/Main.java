package level1.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Object> list = new ArrayList<>();
        addObjects(list);
        List<String> result = filterAndOrderList(list);
        System.out.println(result.toString());
    }

    public static void addObjects(List<Object> list)
    {
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
    }

    public static List<String> filterAndOrderList(List<Object> list)
    {
        List<String> orderedStrings = list.stream()
                .filter(element -> element instanceof String)
                .map(element ->(String) element)
                .sorted((s1,s2) -> s2.length()-s1.length())
                .toList();
        return orderedStrings;
    }
}
