import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Courses {

    private Student student;
    private HashMap<Integer, List<Student>> courseMap;
    public Courses(Student student) {
        this.student = student;
    }

    public void storeStudents(){
        for(Map.Entry<Integer, List<Student>> entry: courseMap.entrySet()){
        }
    }

    public Student getStudent() {
        return student;
    }

//    public void setStudent(Student student) {
//        this.student = student;
//    }

    @Override
    public String toString() {
        return "Courses{" +
                "student=" + student +
                '}';
    }
}
