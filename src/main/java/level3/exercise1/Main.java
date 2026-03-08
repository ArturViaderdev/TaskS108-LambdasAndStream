package level3.exercise1;

public class Main {
    public static void main(String[] args)
    {
        Methods methods = Methods.getInstance();
        methods.fillStudents();
        System.out.println("Mostro nom i edat de tots els estudiants.");
        methods.showNameAndAge();
        System.out.println("Mostro estudiants que el seu nom comença per A");
        methods.showStudentsStartingByA();
        System.out.println("Mostro els aprovats.");
        methods.showApproved();
        System.out.println("Mostro els aprovats que no són de PHP.");
        methods.showApprovedNoPhp();
        System.out.println("Mostro els estudiants majors de edat que fan Java.");
        methods.showAdultJavaStudents();
    }
}
