package level2.exercise3;

public class Program {
    private Operator add;
    private Operator subtract;
    private Operator multiply;
    private Operator divide;

    public Program()
    {
        add = (a,b) -> a+b;
        subtract = (a,b) -> a-b;
        multiply = (a,b) -> a*b;
        divide = (a,b) -> a/b;
    }

    public void start()
    {
        float a = 10f;
        float b = 2f;
        doOperations(a,b);
    }

    public void doOperations(float a, float b)
    {
        System.out.println("Operacions amb " + Float.toString(a) + " i " + Float.toString(b));
        System.out.println("Suma:" + Float.toString(add.operation(a,b)));
        System.out.println("Resta:" + Float.toString(subtract.operation(a,b)));
        System.out.println("Multiplicació:" + Float.toString(multiply.operation(a,b)));
        System.out.println("Divisió:" + Float.toString(divide.operation(a,b)));
    }
}
