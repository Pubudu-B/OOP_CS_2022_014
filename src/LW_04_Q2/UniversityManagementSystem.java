package LW_04_Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department dept = new Department("Software Engineering");
        Degree degree = new Degree("Computer Science", 100);
        Course course = new Course("Object Oriented Programming", "Core", 50);

        Lecturer lecturer = new Lecturer("Dr. Perera", "Senior Lecturer", dept);
        UniStudent student = new UniStudent("Kamal", "CS2022_001", "2nd Year");

        dept.appointDepartmentHead(lecturer);
        dept.addLecturer(lecturer);
        dept.offerCourse(course);

        degree.offerCourse(course);

        course.addLecturerInCharge(lecturer);
        course.addDegreeBelongsTo(degree);

        lecturer.addCourse(course);

        student.registerDegree(degree);
        student.enrollCourse(course);

        System.out.println("--- INFO ---");
        lecturer.displayInfo();
        student.displayInfo();
        dept.displayInfo();
        course.displayInfo();
        degree.displayInfo();
    }
}