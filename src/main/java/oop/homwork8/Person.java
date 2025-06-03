package oop.homwork8;

public class Person {
    private final String name;
    private final Position position;
    private final long id;

    public Person(String name, Position position, long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {return name;}
    public Position getPosition() {return position;}
    public long getId() {return id;}
}
