package oop.homwork8;

import java.util.Map;

public class PersonDatabase {
    private Map<Long, Person> persons;

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
        if (person != null) {
            switch (person.getPosition()) {
                case MANAGER:
                case DIRECTOR:
                case BRANCH_DIRECTOR:
                case SENIOR_MANAGER:
                    return true;
                default:
                    return false;

            }
        }
        return false;
    }

    public boolean isEmployee(long id) {
        Person person = findByld(id);
        if (person != null && !isManager(person)) {
            return true;
        }
        return false;
    }
}
