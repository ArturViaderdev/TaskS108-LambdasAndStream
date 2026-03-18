package level1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static level1.exercise2.Main.addVehicles;
import static level1.exercise2.Main.filterByLetterOAndMinimumLength;


public class Exercise2Test {
    @Test
    public void checkOLetterInVehicles()
    {
        List<String> vehicles = new ArrayList<>();
        addVehicles(vehicles);
        List<String> result;
        result = filterByLetterOAndMinimumLength(vehicles);
        boolean correct = true;
        for(String vehicle:result)
        {
            if(!(vehicle.contains("o")) || vehicle.length()<=5)
            {
                correct = false;
                break;
            }
        }
        Assertions.assertTrue(correct);
    }
}
