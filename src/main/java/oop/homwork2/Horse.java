package oop.homwork2;

public class Horse extends Animal {
    public Horse(String name, double ranningSpeed, double sweemingSpeed, int endurance) {
        super(name, ranningSpeed, sweemingSpeed, endurance);
    }

    @Override
    public double run(int distance) {
        if(distance > endurance) {
            System.out.println(name + ": Лошадь устала");
            isTired = true;
            return -1;
        }
        double time = distance/ranningSpeed;
        endurance = endurance - distance;
        return time;

    }

    @Override
    public double swim(int distance) {
        if(distance*4 > endurance) {
            System.out.println(name + ": Лошадь устала");
            isTired = true;
            return -1;
        }
        double time = distance/ranningSpeed;
        endurance = endurance - distance*4;
        System.out.println(name + ": проплыл " + distance + " метров за " + (int)time + " секунд");
        return time;
    }
}
