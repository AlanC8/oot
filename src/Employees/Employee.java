package Employees;
import Main.Message;

import java.util.Date;
import java.util.List;

public class Employee extends User implements Researcher {
    private double salary;
    private Date hireDate;

    public Employee(int id, String login, String password, String firstName, String lastName, double salary, Date hireDate) {
        super(id, login, password, firstName, lastName);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters and setters for salary and hireDate
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }



//    public void sendMessage(String recipient, String messageContent) {
//        Message message = new Message(this, recipient, messageContent);
//        message.send();
//    }
//
//
//    public void checkMessages() {
//        List<Message> messages = MessageService.getMessagesForUser(this.getId());
//        for (Message message : messages) {
//            System.out.println("From: " + message.getSender());
//            System.out.println("Main.Message: " + message.getContent());
//            // Additional processing can be added here, like marking messages as read
//        }
//    }
}
