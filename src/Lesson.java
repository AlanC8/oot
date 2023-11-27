import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {
    private String name;
    private String code;
    private int credits;

    public Lesson(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return credits == lesson.credits && Objects.equals(name, lesson.name) && Objects.equals(code, lesson.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, credits);
    }



    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", credits=" + credits +
                '}';
    }
}
