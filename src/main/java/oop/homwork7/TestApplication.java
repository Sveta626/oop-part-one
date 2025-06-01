package oop.homwork7;

public class TestApplication {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Иван Иванов", "+79263154567");
        book.add("Сергей Сергеев", "+74562414532");
        book.add("Иван Иванов", "+79263159090");
        System.out.println(book.find("Иван Иванов"));
        System.out.println(book.containsPhoneNumber("+74562414532"));
        System.out.println(book.containsPhoneNumber("+79256789890"));
    }
}