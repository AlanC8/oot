package Employees;
import Enum.Languages;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class User implements Serializable {
    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private Languages languages;

    public User(int id, String login, String password, String firstName, String lastName) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void login(){
//        TODO:
    }

    public void logout(){
//        TODO:
    }

//    public void viewNews(){
//        News news = new News();
//        news.getNews();
//    }

    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши свой новый пароль: ");
        String password = scanner.next();
        setPassword(password);
        System.out.println("Успешно обновили пароль для wsp");
    }

    public void updateLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши свой новый логин: ");
        String login = scanner.next();
        setLogin(login);
        System.out.println("Успешно обновили логин для wsp");
    }
    public void changeLanguage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type what language you need?" +
                "1) KZ" +
                "2) RU" +
                "3) ENG");
        String answer = scanner.next();
        if(answer.equals("1") || answer.equalsIgnoreCase("KZ")){
            languages = Languages.KZ;
        }
        if(answer.equals("2") || answer.equalsIgnoreCase("RU")){
            languages = Languages.RUS;
        }
        if(answer.equals("3") || answer.equalsIgnoreCase("ENG")){
            languages = Languages.ENG;
        }
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", languages=" + languages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && languages == user.languages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, firstName, lastName, languages);
    }
}
