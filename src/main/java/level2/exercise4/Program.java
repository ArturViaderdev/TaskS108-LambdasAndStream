package level2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    private List<String> list;
    public Program()
    {
        list = new ArrayList<>();
    }

    public void start()
    {
        addObjects();
        List<String> result;
        System.out.println("Ordenat pel primer caràcter:");
        result = sortListForFirstChaacter(list);
        System.out.println(result.toString());
        System.out.println("Els que tenen la lletra e primer:");
        result = sortListEFirst(list);
        System.out.println(result.toString());
        System.out.println("Reemplaçant les a per 4.");
        result = replaceAFor4(list);
        System.out.println(result.toString());
        System.out.println("Només els numèrics.");
        result = onlyNumerics(list);
        System.out.println(result.toString());
    }

    public void addObjects()
    {
        list.add("artur");
        list.add("2");
        list.add("pere");
        list.add("manolo");
        list.add("4");
    }

    private static List<String> sortListForFirstChaacter(List<String> list) {
        return list.stream()
                .sorted((s1,s2) -> Character.compare(s1.charAt(0) , s2.charAt(0)))
                .collect(Collectors.toList());
    }

    private static List<String> sortListEFirst(List<String> list)
    {
        return list.stream()
                .sorted((s1,s2) -> Boolean.compare(s2.contains("e"),s1.contains("e")))
                .collect(Collectors.toList());
    }

    private static List<String> replaceAFor4(List<String> list)
    {
        return list.stream()
                .map(s->s.contains("a") ? s.replace("a","4"):s)
                .collect(Collectors.toList());
    }

    private static List<String> onlyNumerics(List<String> list)
    {
        return list.stream()
                .filter(s->s.matches("\\d+"))
                .collect(Collectors.toList());
    }
}
