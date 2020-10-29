package Lab13;
import java.util.Arrays;
import java.util.Comparator;

public class Test {

    Student[] Arr = new Student[4];
    String[] stds = {"Федор", "Эмиль", "Данила", "Игорь"};
    String name, id, gpa;
    SortingStudentsByGPA t1 = new SortingStudentsByGPA();

    public Test() {
        for(int i = 0; i < 4; i++)
            Arr[i] = new Student((int) (Math.random() * 100), Math.round((Math.random()*5)*1000)/1000D, stds[i]);
        System.out.println("Начальный список студентов");
        Print();
        SortID();
        SortGpa();
    }

    private void SortID() {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        };
        Arrays.sort(Arr, comparator);
        System.out.println("\n\nСписок студентнов отсортированный по id");
        Print();
    }

    private void SortGpa() {
        System.out.println("\n\nСписок студентнов отсортированный по среднему баллу");
        SortingStudentsByGPA t1 = new SortingStudentsByGPA();
        Arrays.sort(Arr, t1);
        Print();
    }
    public void Print() {
        name = id = gpa = "";
        for(int i = 0; i < 4; i++) {
            name += "Студент: "+Arr[i].getName()+"\t";
            id += "id: "+Arr[i].getId()+"\t\t\t";
            gpa += "Ср. балл: "+Arr[i].getGpa()+"\t";
        }
        System.out.println(name+"\n"+id+"\n"+gpa+"\n");
    }
    public static void main(String[] args) {
        Test ch1 = new Test();
    }
}