package level3.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    private static final Methods instance = new Methods();
    private List<Student> students;

    public Methods()
    {
        students = new ArrayList<>();
    }

    public static Methods getInstance()
    {
        return instance;
    }

    public void fillStudents()
    {
        students.add(new Student("Artur",43,"Java",9));
        students.add(new Student("Pere",25,"PHP",4));
        students.add(new Student("Marta",40,"Java",4));
        students.add(new Student("Simón",12,"Java",4));
    }

    public void showNameAndAge()
    {
        students.forEach(student -> System.out.println(student.getName() + " " + Integer.toString(student.getAge())));
    }

    public void showStudentsStartingByA()
    {
        List<Student> result = students.stream()
                .filter(student->student.getName().startsWith("A"))
                .toList();
        showList(result);
    }

    public void showApproved()
    {
        List<Student> approved = students.stream()
                .filter(student->student.getMark()>=5)
                .toList();
        showList(approved);
    }

    public void showApprovedNoPhp()
    {
        List<Student> approved = students.stream()
                .filter(student->(student.getMark()>=5 && !(student.getCourse().equals("PHP"))))
                .toList();
        showList(approved);
    }

    public void showAdultJavaStudents()
    {
        List<Student> result = students.stream()
                .filter(student->(student.getCourse().equals("Java") && student.getAge()>=18))
                .toList();
        showList(result);
    }

    private void showList(List<Student> list)
    {
        list.forEach(student-> System.out.println(student.toString()));
    }
}
