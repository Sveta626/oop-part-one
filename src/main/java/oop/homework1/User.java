package oop.homework1;

public class User {
    private String fio;
    private int birthday;
    private String email;

    // методы для получения значения

    public String getFio() {
        return fio;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public User(String fio, int birthday, String email) {
        this.fio = fio;
        this.birthday = birthday;
        this.email = email;
    }
    public void showInfo() {
        System.out.println("ФИО: " + this.fio);
        System.out.println("Год рождения: " + this.birthday);
        System.out.println("Email: " + this.email);
    }

}
