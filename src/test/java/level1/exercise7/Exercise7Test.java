package level1.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;




public class Exercise7Test {
    @Test
    public void filterAndOrderTest()
    {
        Program program = new Program();
        List<String> result =  program.addObjectsFilterAndOrder();
        Boolean correct = true;
        for(int count=0;count<result.size();count++)
        {
            if(count>0)
            {
                String actual = result.get(count);
                String previous = result.get(count-1);
                if(actual.length()>previous.length())
                {
                    correct = false;
                    break;
                }
            }
        }
        Assertions.assertTrue(correct);
    }
}
