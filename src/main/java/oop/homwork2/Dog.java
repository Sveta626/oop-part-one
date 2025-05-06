package oop.homwork2;

public class Dog extends Animal {
    public Dog(String name, double ranningSpeed, double sweemingSpeed, int endurance) {
        super(name, ranningSpeed, sweemingSpeed, endurance);
    }

    @Override
    public double run(int distance) {
        if(distance > endurance) {
            System.out.println(name + ": Собака устала");
            isTired = true;
            return -1;
        }
        double time = distance/ranningSpeed;
        endurance = endurance - distance;
        return time;
    }

    @Override
    public double swim(int distance) {
        if(distance*2 > endurance) {
        System.out.println(name + ": Собака устала");
        isTired = true;
        return -1;
    }
        double time = distance/ranningSpeed;
        endurance = endurance - distance*2;
        System.out.println(name + ": проплыл " + distance + " метров за " + (int)time + " секунд");
        return time;
    }


}

