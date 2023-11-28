import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class ObjectSerialization {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("storage-mainLesson1.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            List<Lesson> lessonListCourse1 = new ArrayList<>(List.of(
                    new Lesson("Programming Princeples 1", "CSCI1103", 6),
                    new Lesson("Calculus 1", "MATH1102", 5),
                    new Lesson("Discrete Stuctures", "CSCI1102", 5),
                    new Lesson("English", "LAN1180", 10),
                    new Lesson("Programming Princeples 2", "CSCI1204", 6),
                    new Lesson("Calculus 2", "MATH1202", 5),
                    new Lesson("Physics 1", "FUN1105", 5),
                    new Lesson("Statistics", "STAT2201", 5),
                    new Lesson("Merging Personal and Global", "HUM1137", 8),
                    new Lesson("Linear Algebra", "MATH1203", 5)

            ));
            HashMap<Integer, List<Lesson>> lessonMap = new HashMap<>();
            lessonMap.put(1, lessonListCourse1);

            List<Lesson> lessonListCourse2 = new ArrayList<>(List.of(
                    new Lesson("Database", "CSCI2104", 5),
                    new Lesson("Algorithms and Data Structures", "CSCI2105", 5),
                    new Lesson("Computer Architecture", "CSCI3115", 5),
                    new Lesson("Object-Oriented Programming and Design", "CSCI2106", 5),
                    new Lesson("Physical Education 1", "PHE101", 4),
                    new Lesson("Russian", "LAN1100", 5),
                    new Lesson("Kazakh", "LAN1100", 5),
                    new Lesson("Web development", "INFT2205", 6),
                    new Lesson("Computer Networks", "CSCI2109", 6),
                    new Lesson("Introduction to Bussiness Network", "CSCI2109", 6),
                    new Lesson(),
                    new Lesson("Physical Education 2", "PHE102", 4)
            ));
            lessonMap.put(2, lessonListCourse2);

            List<Lesson> lessonListCourse3 = new ArrayList<>(List.of(
                    new Lesson("Software Engineering", "CSCI2208", 5),
                    new Lesson("Fundamentals of bussiness for Information Systems", "INF3106", 5),
                    new Lesson("Basics of Information Systems", "INF3106", 5),
                    new Lesson(),
                    new Lesson("ICT", "INFT1101", 5),
                    new Lesson("History", "HUM1101", 5),
                    new Lesson("Field Prrojects for IS", "INFT3210", 5),
                    new Lesson("Cyber Security", "INFT3105", 5),
                    new Lesson(),
                    new Lesson(),
                    new Lesson(),
                    new Lesson("Philosophy", "HUM1102",5)

            ));
            lessonMap.put(3, lessonListCourse3);
            List<Lesson> lessonListCourse4 = new ArrayList<>(List.of(
                    new Lesson("IT Project Management", "INFT3108",5),
                    new Lesson("Industrial Internship", "PRA334",5),
                    new Lesson(),
                    new Lesson(),
                    new Lesson(),
                    new Lesson(),
                    new Lesson(),
                    new Lesson(),
                    new Lesson("Research Tools and Methods", "CSCI4102", 4),
                    new Lesson("Pre Diploma internship", "PRA437", 8),
                    new Lesson("Final Attestation", "IA504", 5)
            ));
            lessonMap.put(4, lessonListCourse4);
            objectOutputStream.writeObject(lessonMap);
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("An error ocured!");
        }

    }
//    public void serialize() {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Type Name for storage file(without file extension): ");
//            String strge = scanner.next();
//            System.out.println("Type Name for the second time to check(without file extension): ");
//            String strge1 = scanner.next();
//            if (strge.equals(strge1)) {
//                String filename = strge + ".bin";
//                File file = new File(filename);
//                if (file.createNewFile()) {
//                    FileOutputStream fileOutputStream = new FileOutputStream(filename);
//                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//                    System.out.println("What object do you want to call?");
//                    System.out.println("1) Lesson");
//                    String answer = scanner.next();
//                    if (answer.equalsIgnoreCase("lesson") || answer.equalsIgnoreCase("1")) {
//                        boolean go = true;
//                        while (go) {
//                            System.out.println("Type (q) to stop serialize");
//
//                            System.out.println("Add name: ");
//                            String type = scanner.next();
//
//                            System.out.println("Add code: ");
//                            String type1 = scanner.next();
//
//                            System.out.println("Add credits: ");
//                            String type2 = scanner.next();
//
//                            if (type.equalsIgnoreCase("q")
//                                    && type1.equalsIgnoreCase("q")
//                                    && type2.equalsIgnoreCase("q")) {
//                                go = false;
//                            } else {
//                                List<Lesson> lessonList = new ArrayList<>();
//                                lessonList.add(addMainLesson(type, type1, Integer.parseInt(type2)));
//                                objectOutputStream.writeObject(lessonList);
//                                ;
//                            }
//                        }
//                    }
//
//                    fileOutputStream.close();
//                }
//            } else {
//                System.out.println("This storage data already createn!");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException("An error occured");
//        }
//    }
}
