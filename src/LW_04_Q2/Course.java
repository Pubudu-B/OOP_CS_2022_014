package LW_04_Q2;

public class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, Integer num) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = num;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEnrollType() { return enrollType; }
    public void setEnrollType(String type) { this.enrollType = type; }
    public Integer getNumberOfStudentsEnrolled() { return numberOfStudentsEnrolled; }
    public void setNumberOfStudentsEnrolled(Integer num) { this.numberOfStudentsEnrolled = num; }

    public void addLecturerInCharge(Lecturer l) { this.lecturerInCharge = l; }
    public void removeLecturerInCharge() { this.lecturerInCharge = null; }
    public void addDegreeBelongsTo(Degree d) { this.degreeBelongsTo = d; }
    public void removeDegreeBelongsTo() { this.degreeBelongsTo = null; }

    public void displayInfo() { System.out.println("Course: " + name); }
}