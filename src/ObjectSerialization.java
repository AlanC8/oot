import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ObjectSerialization {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", "Smith", new Lesson("Programming Principles 1", "CSCI1103", 6));
        Student student2 = new Student(2, "Bob", "Johnson", new Lesson("Calculus 1", "MATH1102", 5));
        Student student3 = new Student(3, "Charlie", "Williams", new Lesson("Discrete Structures", "CSCI1102", 5));
        List<Student> studentList = new ArrayList<>(List.of(
            student1, student2, student3
        ));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("storage.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(studentList);
            fileOutputStream.close();
//            ( . )( . )
//             \ /
//              ^
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
