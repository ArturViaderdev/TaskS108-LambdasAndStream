package level1.exercise6;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static level1.exercise6.Main.addObjects;
import static level1.exercise6.Main.filterAndOrderList;

public class Exercise6Test {
    @Test
    public void filterAndOrderTest()
    {
        List<Object> list = new ArrayList<>();
        addObjects(list);
        List<String> result = filterAndOrderList(list);
        Boolean correct = true;
        for(int count=0;count<result.size();count++)
        {
            if(count>0)
            {
                String actual = result.get(count);
                String previous = result.get(count-1);
                if(actual.length()<previous.length())
                {
                    correct = false;
                    break;
                }
            }
        }
        Assertions.assertTrue(correct);
    }
}
