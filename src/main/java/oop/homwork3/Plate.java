package oop.homwork3;

public class Plate {
    private int maxFood;
    private int currentFood;

/*
Конструктор принимает максимальный объем и сразу заполняет тарелку
 */

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;

    }
 //Добавляем еду в тарелку
 public void addFood(int amount) {
        if((this.currentFood + amount) <= this.maxFood) {
            this.currentFood += amount;
        }
 }
 //Уменьшаем количество в тарелке, проверяем наличие объема
    public boolean eatFood(int amount) {
        if(amount > this.currentFood)
            return false;
        this.currentFood -= amount;
        return true;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }
}