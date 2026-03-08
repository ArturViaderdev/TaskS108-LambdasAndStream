package level3.exercise1;

public class Student {
    private String name;
    private int age;
    private String course;
    private int mark;

    public Student(String name, int age, String course,int mark)
    {
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getMark()
    {
        return mark;
    }

    public String getCourse()
    {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", mark=" + mark +
                '}';
    }
}
