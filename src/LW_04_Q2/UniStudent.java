package LW_04_Q2;
import java.util.ArrayList;

public class UniStudent extends UniPerson {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public UniStudent(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }
    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }

    public void registerDegree(Degree d) { this.degree = d; }

    public void displayDegreeInfo() {
        if (degree != null) degree.displayInfo();
    }

    public void enrollCourse(Course c) { coursesEnrolled.add(c); }
    public void unenrollCourse(Course c) { coursesEnrolled.remove(c); }

    public void listCoursesEnrolled() {
        System.out.println("Enrolled Courses:");
        for (Course c : coursesEnrolled) {
            System.out.println(c.getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + getName() + ", ID: " + studentID);
    }
}