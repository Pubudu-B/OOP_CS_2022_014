package LW_04_Q2;
import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void appointDepartmentHead(Lecturer head) { this.departmentHead = head; }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) System.out.println("Head: " + departmentHead.getName());
    }

    public void addLecturer(Lecturer l) { lecturersBelongsTo.add(l); }
    public void removeLecturer(Lecturer l) { lecturersBelongsTo.remove(l); }
    public void offerCourse(Course c) { coursesOffering.add(c); }
    public void withdrawCourse(Course c) { coursesOffering.remove(c); }

    public void displayInfo() { System.out.println("Department: " + name); }
}