package level2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<String> names;
    public Program()
    {
        names = new ArrayList<>();
    }

    public void start()
    {
        List<String> result = addAndFilterNames();
        System.out.println(result.toString());
    }

    public List<String> addAndFilterNames()
    {
        addNames();
        List<String> result = filterNamesStartingWithAAndHavesThreeLetters();
        return result;
    }

    public void addNames()
    {
        names.add("Artur");
        names.add("Ana");
        names.add("Marta");
        names.add("Pau");
        names.add("Aro");
        names.add("Antoni");
        names.add("Pere");
    }

    public List<String> filterNamesStartingWithAAndHavesThreeLetters()
    {
        return names.stream()
                .filter(name -> name.startsWith("A") && name.length()==3).toList();
    }
}
