package LW_04_Q2;
import java.util.ArrayList;

public class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getNumberOfStudents() { return numberOfStudents; }
    public void setNumberOfStudents(Integer n) { this.numberOfStudents = n; }

    public void offerCourse(Course c) { coursesOffering.add(c); }
    public void withdrawCourse(Course c) { coursesOffering.remove(c); }

    public void listCoursesOffering() {
        System.out.println("Degree Courses:");
        for (Course c : coursesOffering) {
            System.out.println(c.getName());
        }
    }

    public void displayInfo() { System.out.println("Degree: " + name); }
}