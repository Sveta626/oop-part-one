package oop.homwork2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 3, 100);
        Dog dog = new Dog("Бобик", 3, 3, 800);
        Horse horse = new Horse("Люся", 10, 1, 1000);


        System.out.println("Вася пробежал дистанцию: " + cat.run(60) + " секунд");
        System.out.println("Бобик пробежал дистанцию: " + (int) dog.run(100) + " секунд");
        System.out.println("Люся пробежала дистанцию: " + horse.run(600) + " секунд");

        cat.swim(10);
        dog.swim(55);
        horse.swim(200);

        cat.info();
        dog.info();
        horse.info();

    }

}
