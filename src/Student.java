import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private int course;
    private String name;
    private String surname;

    public Student(int id, int course, String name, String surname) {
        this.id = id;
        this.course = course;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, course, name, surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", course=" + course +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
