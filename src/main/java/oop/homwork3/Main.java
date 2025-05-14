package oop.homwork3;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(20);// общая тарелка

        //массив котов
        Cat[] cats = new Cat[]{
                new Cat("Борис", 2),
                new Cat("Мурзик", 4),
                new Cat("Василиса", 6),
                new Cat("Василий", 8)
        };
        //просим поесть кота из общей тарелки
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " хочет есть");
            cat.feedFromPlate(plate);
            plate.addFood(2);
            System.out.println(plate.getCurrentFood());
        }
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}