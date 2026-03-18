package level2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static level2.exercise1.Main.addNames;
import static level2.exercise1.Main.filterNamesStartingWithAAndHavesThreeLetters;

public class Exercise1Test {
    @Test
    public void filterTest()
    {
        List<String> names= new ArrayList<>();
        addNames(names);
        List<String> result = filterNamesStartingWithAAndHavesThreeLetters(names);
        boolean correct = true;
        for(String name:result)
        {
            if(!(name.startsWith("A") && name.length()==3))
            {
                correct=false;
                break;
            }
        }
        Assertions.assertTrue(correct);
    }
}
