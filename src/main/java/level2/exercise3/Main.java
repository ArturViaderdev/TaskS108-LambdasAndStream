package level2.exercise3;

public class Main {
    public static void main(String[] args)
    {
        Operator add = (a,b) -> a+b;
        Operator subtract = (a,b) -> a-b;
        Operator multiply = (a,b) -> a*b;
        Operator divide = (a,b) -> a/b;
        float a = 10f;
        float b = 2f;
        System.out.println("Operacions amb " + Float.toString(a) + " i " + Float.toString(b));
        System.out.println("Suma:" + Float.toString(add.operation(a,b)));
        System.out.println("Resta:" + Float.toString(subtract.operation(a,b)));
        System.out.println("Multiplicació:" + Float.toString(multiply.operation(a,b)));
        System.out.println("Divisió:" + Float.toString(divide.operation(a,b)));
    }
}
