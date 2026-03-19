package level1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class Exercise1Test {
    @Test
    public void checkOLetterInVehicles()
    {
        Program program = new Program();
        List<String> filteredVehicles = program.addAndFilterVehicles();
        boolean correct = true;
        for(String vehicle:filteredVehicles)
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
