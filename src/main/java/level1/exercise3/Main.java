package level1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> months = new ArrayList<>();
        months.add("gener");
        months.add("febrer");
        months.add("març");
        months.add("abril");
        months.add("maig");
        months.add("juny");
        months.add("juliol");
        months.add("agost");
        months.add("setembre");
        months.add("octubre");
        months.add("novembre");
        months.add("desembre");

        months.forEach(month ->{System.out.println(month);});
    }
}
