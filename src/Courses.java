import java.util.List;

public class Courses {
    private List<Lesson> courseList;

    public Courses() {
    }

    public void addCourse(String name, String code, int credits){
        Lesson lesson = new Lesson(name, code, credits);
        if(!courseList.contains(lesson)){
            courseList.add(lesson);
        } else {
            System.out.println("This course already added");
        }
    }

    public List<Lesson> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Lesson> courseList) {
        this.courseList = courseList;
    }


}
