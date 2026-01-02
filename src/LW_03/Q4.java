package LW_03;

public class Q4 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Perera");
        lecturer.setCourseTeaching("OOP");

        Course course = new Course();
        course.setCourseName("OOP");
        course.setCourseCode("CS2022");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Nimal");
        student.setDegreeName("Computer Science");
        student.setCourseFollowing(course.getCourseName());

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + student.getStudentName());
    }
}