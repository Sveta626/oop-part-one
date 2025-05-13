package oop.homwork2;

public class Cat extends Animal {
    public Cat(String name, double ranningSpeed, int endurance) {
        super(name, ranningSpeed, 0, endurance);
    }

    @Override
    public double run(int distance) {

        if (distance > endurance) {
            System.out.println(name + ": Кот устал");
            isTired = true;
            return -1;
        }
        double time = distance / ranningSpeed;
        endurance -= distance;
        return time;

    }

    @Override
    public double swim(int distance) {
        System.out.println(name + ": Кот не умеет плавать");
        return 0;
    }
}


