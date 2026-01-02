package LW_04_Q2;
import java.util.ArrayList;

public class Lecturer extends UniPerson {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public void setDepartment(Department department) { this.department = department; }

    public void displayDepartmentInfo() {
        if (department != null) department.displayInfo();
    }

    public void addCourse(Course c) { coursesTeaching.add(c); }
    public void removeCourse(Course c) { coursesTeaching.remove(c); }

    public void listCoursesTeaching() {
        System.out.println("Teaching Courses:");
        for (Course c : coursesTeaching) {
            System.out.println(c.getName());
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer: " + getName() + ", Position: " + position);
    }
}