package Lab13;

public class Student {

    private int id;
    private double gpa;
    private String name;

    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }
}