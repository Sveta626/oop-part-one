package oop.homwork4;

import org.w3c.dom.ls.LSOutput;

public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person("Иван ", 50);
        Person person1 = new Person("Федя", 55 );
        Person person2 = new Person("Вася", 80 );
        Person person3 = new Person("Миша", 30 );



        Car car = new Car();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();
        AllTerrainVehicle atv = new AllTerrainVehicle();


        person.setCurrentTransport(horse);
        System.out.println(person.move(50,Terrain.FOREST));
        System.out.println(person1.move(5,Terrain.PLAIN));
        person2.setCurrentTransport(car);
        System.out.println(person2.move(100,Terrain.PLAIN));
        person3.setCurrentTransport(atv);
        System.out.println(person3.move(40,Terrain.SWAMP));


    }
}