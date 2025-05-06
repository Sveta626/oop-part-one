package oop.homwork2;

import javax.naming.Name;

public abstract class Animal {
    String name;
    double ranningSpeed;
    double sweemingSpeed;
    int endurance;
    boolean isTired;

    public Animal(String name, double ranningSpeed, double sweemingSpeed, int endurance) {
        this.name = name;
        this.ranningSpeed = ranningSpeed;
        this.sweemingSpeed = sweemingSpeed;
        this.endurance = endurance;
        this.isTired = false;
    }
    public abstract double run(int distance);
    public abstract double swim(int distance);
    public void info(){
        System.out.println(name + ": Выносливость = " + endurance + ": Усталость " + isTired);
    }
}
