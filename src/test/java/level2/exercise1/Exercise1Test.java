package level2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Exercise1Test {
    @Test
    public void filterTest()
    {
        Program program = new Program();
        program.start();
        List<String> result = program.addAndFilterNames();
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
