package level1.exercise1;

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
        result = filterByLetterO(vehicles);
        return result;
    }

    public void start()
    {
        List<String> filteredVehicles = addAndFilterVehicles();
        ConsoleUI.showMessage("Vehicles amb la lletra o: " + filteredVehicles.toString());
    }

    public List<String> filterByLetterO(List<String> vehicles)
    {
        List<String> result = new ArrayList<>();
        //vehicles.forEach(vehicle-> { if(vehicle.contains("o")) result.add(vehicle);});
        result=vehicles.stream().filter(vehicle->vehicle.contains("o")).toList();
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
