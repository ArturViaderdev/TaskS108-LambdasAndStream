package level1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static level1.exercise1.Main.addVehicles;
import static level1.exercise1.Main.filterByLetterO;

public class Exercise1Test {
    @Test
    public void checkOLetterInVehicles()
    {
        List<String> vehicles = new ArrayList<>();
        addVehicles(vehicles);
        List<String> result;
        result = filterByLetterO(vehicles);
        boolean correct = true;
        for(String vehicle:result)
        {
            if(!(vehicle.contains("o")))
            {
                correct = false;
                break;
            }
        }
        Assertions.assertTrue(correct);
    }
}
