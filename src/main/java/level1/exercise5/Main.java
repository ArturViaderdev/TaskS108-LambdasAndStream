package level1.exercise5;

public class Main {
    public static void main(String[] args)
    {
        PiValue piValue = () -> 3.1415;
        System.out.println(Double.toString(piValue.getPiValue()));
    }
}
