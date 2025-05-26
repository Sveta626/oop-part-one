package oop.homwork6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> generateRange(int min, int max) {
        if (max < min)
            throw new IllegalArgumentException("Max должно быть больше или равно Min");

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            result.add(i);
        }
        return result;
    }

    public static int sumElementsGreaterThanFive(List<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            if (num != null && num > 5) {
                sum += num;
            }
        }
        return sum;
    }


    public static void overwriteAllWithValue(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }


    public static void increaseEachByValue(List<Integer> list, int increment) {
        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i);
            if (current != null) {
                list.set(i, current + increment);
            }
        }
    }


    public static List<String> getNamesOfEmployees(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee emp : employees) {
            names.add(emp.getName());
        }
        return names;
    }

    public static List<Employee> filterOlderThan(List<Employee> employees, int minAge) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() >= minAge) {
                filtered.add(emp);
            }

        }
        return filtered;
    }

    public static boolean checkAverageAge(List<Employee> employees, double avgAge) {
        if (employees.isEmpty()) {
            return false;
        }
        int totalAge = 0;
        for (Employee emp : employees) {
            totalAge += emp.getAge();
        }
        double ourAvgAge = (double) totalAge / employees.size();
        if (ourAvgAge > avgAge) {
            return true;
        } else {
            return false;
        }

    }

    public static Employee findYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            return null;
        }

        Employee youngest = employees.get(0);
        for (Employee emp : employees) {
            if (emp.getAge() < youngest.getAge()) {
                youngest = emp;
            }
        }
        return youngest;
    }


}