import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectDeserialization {
    private int dataSize;

    public void studentsDeserializer(){
        try {
                FileInputStream fileInputStream = new FileInputStream("storage-students.bin");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                List<Student> studentList = (List<Student>) objectInputStream.readObject();
                studentList.forEach((p) -> {
                    System.out.println(p);
                });
                fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public int getDataSize() {
        try {
            FileInputStream fileInputStream = new FileInputStream("storage-students.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> studentList = (List<Student>) objectInputStream.readObject();
            dataSize = studentList.size();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("HTTP STATUS 404");
        }
        return dataSize;
    }
}
