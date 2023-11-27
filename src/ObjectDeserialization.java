import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectDeserialization {
    public static void main(String[] args) {
        Studdent
        try {
            FileInputStream fileInputStream = new FileInputStream("storage.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> result = (List<Student>) objectInputStream.readObject();
            System.out.println(result);
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
