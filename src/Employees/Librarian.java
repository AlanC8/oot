package Eployee;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import Employees.Book;
import Employees.Employee;
import Employees.User;

public class Librarian extends Employee {
    private List<LibrarySubscription> subscriptions;
    private Vector<Book> listOfBooks;
    private Queue<Request> listOfRequestsLibrary;
    private List<User> users;
    // Constructor
    public Librarian(double salary, Date hireDate, List<LibrarySubscription> subscriptions, Vector<Book> listOfBooks, Queue<Request> listOfRequestsLibrary) {
        super(salary, hireDate);
        this.subscriptions = subscriptions;
        this.listOfBooks = listOfBooks;
        this.listOfRequestsLibrary = listOfRequestsLibrary;
    }

    public List<LibrarySubscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<LibrarySubscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Vector<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(Vector<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Queue<Request> getListOfRequestsLibrary() {
        return listOfRequestsLibrary;
    }

    public void setListOfRequestsLibrary(Queue<Request> listOfRequestsLibrary) {
        this.listOfRequestsLibrary = listOfRequestsLibrary;
    }


    public void giveBook() {

    }

    public void addBook(Book newBook) {
        // Check if the book already exists in the library
        for (Book book : listOfBooks) {
            if (book.getBookId() == newBook.getBookId()) {
                System.out.println("Book with ID " + newBook.getBookId() + " already exists.");
                return;
            }
        }

        // Add the new book to the library
        listOfBooks.add(newBook);
        System.out.println("Book titled '" + newBook.getTitle() + "' added to the library.");
    }

    public void deleteBook(int bookId) {
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getBookId() == bookId) {
                listOfBooks.remove(i);
                System.out.println("Book with ID " + bookId + " has been removed from the library.");
                return;
            }
        }
        System.out.println("Book with ID " + bookId + " not found in the library.");
    }

    public void manageRequests() {

    }

    public void addUser(User newUser) {
        // Check if the user already exists in the system by some unique identifier
        for (User user : users) {
            if (Objects.equals(user.getId(), newUser.getId())) {
                System.out.println("User with ID " + newUser.getId() + " already exists.");
                return;
            }
        }

        // Add the new user to the system
        users.add(newUser);
        System.out.println("User " + newUser.getFirstName() + " " + newUser.getLastName() + " added to the system.");
    }
}
