package Main;

import java.util.List;
import java.util.Vector;
import Enum.Faculty;
import Enum.CourseType;
public class Course {
    private int id;
    private String nameOfCourse;
    private List<Student> students;
    private int numOfCredits;
    private Vector<Course> prerequisities;
    private Faculty faculty;
    private CourseType courseType; // -?

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return nameOfCourse;
    }
}
