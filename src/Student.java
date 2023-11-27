import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private Lesson lesson;

    public Student(int id, String name, String surname, Lesson lesson) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id
                && Objects.equals(name, student.name)
                && Objects.equals(surname, student.surname)
                && Objects.equals(lesson, student.lesson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, lesson);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lesson=" + lesson +
                '}';
    }
}
