package System;


import Employees.User;

import java.io.*;
import java.util.*;

public class SerializableDes extends Database {
    Database database = new Database();
    public void serialize(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type name what file you want serialize!" +
                    "this is from" + this.getClass().getName());
            String filename = scanner.next();
            FileOutputStream fileOutputStream = new FileOutputStream(filename + ".bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(database.getUserVector());
            fileOutputStream.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    private boolean checkContent(String var){
        File folder = new File("./");
        File[] folderList = folder.listFiles();
        for (int i = 0; i < folderList.length; i++) {
            if(folderList[i].getName().equalsIgnoreCase(var)){
                return true;
            }
        }
        return false;
    }
    private void print(File[] folderList){
        for (int i = 0; i < folderList.length; i++) {
            if (folderList[i].isFile() && folderList[i].toString().contains(".bin")) {
                System.out.println("Binary File -> " + folderList[i].getName());
            }
        }
    }
    public <T> void deserialize(){
        System.out.println("--- All existing files to deserialize ---");
        File folder = new File("./");
        File[] folderList = folder.listFiles();
        print(folderList);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type just name: (Example users.bin) -> users");
            String var = scanner.next() + ".bin";
                if(checkContent(var)){
                    FileInputStream fileInputStream = new FileInputStream(var);
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    Vector<User> users = (Vector<User>) objectInputStream.readObject();
                    for(User user : users) System.out.println(user);
                    fileInputStream.close();
                } else {
                    System.out.println("Incorrect Binary Format File to Deserialize");
                }
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
