package level1.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> vehicles = new ArrayList<>();
        addVehicles(vehicles);
        List<String> result;
        result = filterByLetterO(vehicles);
        System.out.println("Vehicles amb la lletra o: " + result.toString());
    }

    public static List<String> filterByLetterO(List<String> vehicles)
    {
        List<String> result = new ArrayList<>();
        vehicles.forEach(vehicle-> { if(vehicle.contains("o")) result.add(vehicle);});
        return result;
    }

    public static void addVehicles(List<String> vehicles)
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