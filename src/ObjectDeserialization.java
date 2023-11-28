import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectDeserialization {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("storage-mainLesson1.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            HashMap<Integer, List<Lesson>> lessons = (HashMap<Integer, List<Lesson>>) objectInputStream.readObject();
            for(Map.Entry<Integer, List<Lesson>> map : lessons.entrySet()){
                    for(var a : map.getValue()){
                        System.out.println(map.getKey() + " -> " + a);
                    }
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
