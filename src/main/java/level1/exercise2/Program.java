package level1.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public Program()
    {

    }

    public List<String> addAndFilterVehicles()
    {
        List<String> vehicles = new ArrayList<>();
        addVehicles(vehicles);
        List<String> result;
        result = filterByLetterOAndMinimumLength(vehicles);
        return result;
    }

    public void start()
    {
        List<String> filteredVehicles = addAndFilterVehicles();
        ConsoleUI.showMessage("Vehicles amb la lletra o i un tamany de més de 5 lletres: " + filteredVehicles.toString());
    }

    public List<String> filterByLetterOAndMinimumLength(List<String> vehicles)
    {
        List<String> result = new ArrayList<>();
        vehicles.forEach(vehicle-> { if(vehicle.contains("o") && vehicle.length()>5) result.add(vehicle);});
        return result;
    }

    public void addVehicles(List<String> vehicles)
    {
        vehicles.add("cotxe");
        vehicles.add("bicicleta");
        vehicles.add("moto");
        vehicles.add("porta-avions");
        vehicles.add("roda");
        vehicles.add("tricicle");
        vehicles.add("patinet");
        vehicles.add("parapent");
        vehicles.add("autobús");
    }
}
