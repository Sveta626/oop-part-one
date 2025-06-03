package oop.homwork8;

import java.util.HashMap;
import java.util.Map;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan Ivanov", Position.DIRECTOR, 134526);
        Person person2 = new Person("Viktor Petrov", Position.DRIVER, 134777);
        Person person3 = new Person("Roman Galkin", Position.MANAGER, 134678);
        Map<Long, Person> personMap = new HashMap<>();
        PersonDatabase personDatabase = new PersonDatabase(personMap);
        personDatabase.add(person1);
        personDatabase.add(person2);
        personDatabase.add(person3);
        System.out.println(personDatabase.findByld(134777).getName());
        System.out.println(personDatabase.findByld(134526).getName());
        System.out.println(personDatabase.findByld(134678).getName());
        System.out.println(personDatabase.isManager(person1));
        System.out.println(personDatabase.isManager(person2));
        System.out.println(personDatabase.isManager(person3));
        System.out.println(personDatabase.isEmployee(134777));
        System.out.println(personDatabase.isEmployee(134526));
        System.out.println(personDatabase.isEmployee(134678));
    }

}
