package oop.homwork6;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> test1 = Main.generateRange(2, 10);
        System.out.println(test1);

        int test2 = Main.sumElementsGreaterThanFive(test1);
        System.out.println(test2);

        Main.overwriteAllWithValue(test1, 55);
        System.out.println(test1);

        Main.increaseEachByValue(test1, 31);
        System.out.println(test1);
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee("Иван", 30);
        Employee employee2 = new Employee("Вася", 40);
        Employee employee3 = new Employee("Миша", 37);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        List<String> test3 = Main.getNamesOfEmployees(employees);
        System.out.println(test3);
        List<Employee> test4 = Main.filterOlderThan(employees, 35);
        for (Employee e : test4) {
            System.out.println(e.getName() + " " + e.getAge());
        }
        System.out.println(Main.checkAverageAge(employees, 40));
        Employee test5 = Main.findYoungestEmployee(employees);
        System.out.println(test5.getAge()   + " " + test5.getName());
    }


}
