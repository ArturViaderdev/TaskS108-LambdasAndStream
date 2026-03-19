package level1.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Program {
    List<Object> list;
    public Program()
    {
        list = new ArrayList<>();
    }

    public void start()
    {
        List<String> list = addObjectsFilterAndOrder();
        System.out.println(list.toString());
    }

    public List<String> addObjectsFilterAndOrder()
    {
        addObjects();
        List<String> result = filterAndOrderList();
        return result;
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

    public List<String> filterAndOrderList()
    {
        return list.stream()
                .filter(element -> element instanceof String)
                .map(element ->(String) element)
                .sorted((s1,s2) -> s2.length()-s1.length())
                .toList();
    }
}
