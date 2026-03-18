package level2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> names= new ArrayList<>();
        addNames(names);
        List<String> result = filterNamesStartingWithAAndHavesThreeLetters(names);
        System.out.println(result.toString());
    }

    public static void addNames(List<String> names)
    {
        names.add("Artur");
        names.add("Ana");
        names.add("Marta");
        names.add("Pau");
        names.add("Aro");
        names.add("Antoni");
        names.add("Pere");
    }

    public static List<String> filterNamesStartingWithAAndHavesThreeLetters(List<String> names)
    {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length()==3).toList();
    }
}
