package level1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    private List<String> months;
    public Methods()
    {
        months = new ArrayList<>();
    }

    public void start()
    {
        addMonths();
        showMonths();
    }

    private void addMonths()
    {
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
    }

    private void showMonths()
    {
        months.forEach(System.out::println);
    }
}
