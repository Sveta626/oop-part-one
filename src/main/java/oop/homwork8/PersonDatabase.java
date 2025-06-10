package oop.homwork8;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class PersonDatabase {
    private Map<Long, Person> persons;
    private Set<Position> managerPosition = EnumSet.of(Position.MANAGER, Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER, Position.DIRECTOR);

    public PersonDatabase(Map<Long, Person> persons) {
        this.persons = persons;
    }

    public void add(Person person) {
        persons.put(person.getId(), person);
        System.out.println(person.getName() + " добавлен");
    }

    public Person findByld(long id) {
        return persons.get(id);
    }

    public boolean isManager(Person person) {
        return managerPosition.contains(person.getPosition());
    }

    public boolean isEmployee(long id) {
        Person person = findByld(id);
        if (person != null && !isManager(person)) {
            return true;
        }
        return false;
    }
}
