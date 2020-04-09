import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public long counter;
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    // constructor
    public Student(String name) {
        counter++;
        this.id = counter;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;

        for (double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public ArrayList<Integer> updateGrade(int index, int gradeReplacement) {
       grades.set(index, gradeReplacement);
       return grades;
    }

    public ArrayList<Integer> deleteGrade(int index) {
        grades.remove(index);
        return grades;
    }
}
