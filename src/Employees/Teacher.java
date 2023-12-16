package Employees;

import java.util.Date;
import java.util.Vector;

import Enum.Faculty;
import Enum.TeacherType;
import Main.Course;
import Main.Student;

public class Teacher extends Employee {
    private Vector<Course> courses;
    private TeacherType type;
    private Faculty faculty;


    public Teacher(int id, String login, String password, String firstName, String lastName, double salary, Date hireDate, Vector<Course> courses, TeacherType type, Faculty faculty) {
        super(id, login, password, firstName, lastName, salary, hireDate);
        this.courses = courses;
        this.type = type;
        this.faculty = faculty;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public TeacherType getType() {
        return type;
    }

    public void setType(TeacherType type) {
        this.type = type;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    // Operations
    public void putMarks(Student student) {
        student.setMarks(MarkType.FIRSTATT, 30);
        student.setMarks(MarkType.SECONDATT, 30);
        student.setMarks(MarkType.FINAL, 40);
    }

    public void manageCourseFiles() {

    }

    public void viewStudents() {
        for (Course course : courses) {
            System.out.println("Course: " + course.getName());
            Vector<Student> students = (Vector<Student>) course.getStudents();
            for (Student student : students) {
                System.out.println("Student Name: " + student.getFirstName());
            }
        }
    }

    public void searchStudent(String studentFirstName, String studentLastName) {
        boolean found = false;
        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                if ((student.getFirstName() + " " + student.getLastName()).equalsIgnoreCase(studentFirstName + " " + studentLastName)) {
                    System.out.println("Found student " + studentFirstName + " " + studentLastName + " in course " + course.getName());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Main.Main.Student " + studentFirstName + " " + studentLastName + " not found.");
        }
    }

    public void viewStudentInfo() {

    }

    public void openAttendance() {

    }

    public boolean startAttendance() {

        return false;
    }

    public void viewMenu() {

    }

    public void getComplain() {
        return;
    }
}
