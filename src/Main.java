import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        System.out.println(
                "Welcome to WSP" + "\n" +
                        "1) To Login" + "\n" +
                        "2) To See News" + "\n" +
                        "3) Admin panel"
        );
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println();
            System.out.println("Login: ");
            String login = scanner.next();
            System.out.println("Password: ");
            String password = scanner.next();

            if(login.equals("a") && password.equals("123")){
                System.out.println("List of students(" + mainController.studentsQuantity() + "):");
                    mainController.getAllStudents();
            } else {
                System.out.println("no good");
            }
        }
    }
}
