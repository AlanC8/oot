package Employees;
import Enum.Faculty;
import Main.Student;

import java.util.Date;
import java.util.List;

public class Manager extends Employee {
    private Faculty typeOfManager;
//    private MenuAction[] menu;

    public Manager(int id, String login, String password, String firstName, String lastName, double salary, Date hireDate, Faculty typeOfManager) {
        super(id, login, password, firstName, lastName, salary, hireDate);
        this.typeOfManager = typeOfManager;
    }

    public void setTypeOfManager(Faculty typeOfManager) {
        this.typeOfManager = typeOfManager;
    }

//    public MenuAction[] getMenu() {
//        return menu;
//    }

//    public void setMenu(MenuAction[] menu) {
//        this.menu = menu;
//    }

    public void manageCourses() {
        // Implementation
    }

    public Faculty getTypeOfManager() {
        return typeOfManager;
    }

    // Additional getter for typeOfManager if needed

    public User getUser() {
        // Implementation
        return null;
    }

    public Employee getEmployee() {
        // Implementation
        return null;
    }

    public void createUser() {
        // Implementation
    }

    public void manageNews() {
        // Implementation
    }

    public void viewStudents() {
        List<Student> students = StudentDatabase.getStudents();
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getFirstName() + ", LastName: " + student.getLastName());
        }
    }

    public void viewTeachers() {
        List<Teacher> teachers = TeacherDatabase.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Name: " + teacher.getFirstName() + ", LastName: " + teacher.getLastName() + ", Department: " + teacher.getDepartment());
        }
    }


    public void statisticalReports() {
        // Implementation
    }

    public void viewMenu() {
        // Implementation
    }

    public void changePassword() {
        // Implementation
    }


}
