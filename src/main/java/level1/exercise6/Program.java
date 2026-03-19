package level1.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<Object> list;

    public Program()
    {
        list = new ArrayList<>();
    }

    public void start()
    {
        addObjects();
        List<String> result = filterAndOrderList();
        System.out.println(result.toString());
    }

    private void addObjects()
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

    private List<String> filterAndOrderList()
    {
        return list.stream()
                .filter(element -> element instanceof String)
                .map(element ->(String) element)
                .sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .toList();
    }
}
