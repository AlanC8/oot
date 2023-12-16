package Main;

import Employees.User;

import Enum.Faculty;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Student extends User {
    private Faculty faculty;
    private Date yearOfEnrollment;
    private int gpa;
    private int semestr;
    private Vector<Course> takingCourses;
//    private HashMap<Course, Mark> marks;
//    private MenuAction[] menu;

    public Student(int id, String login, String password, String firstName, String lastName) {
        super(id, login, password, firstName, lastName);
    }

//    public void setMarks(HashMap<Course, Mark> marks) {
//        this.marks = marks;
//    }
}
