package oop.homwork3;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    //Конструктор кота, устанавливает имя и аппетит
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    //Метод для приема пищи
    public void feedFromPlate(Plate plate){
        if(plate.eatFood(this.appetite)) {
            this.satiety = true;//хватает ли еды в тарелке
        }
    }
    @Override
    public String toString()  {
        return "Кот [" + name + "] сыт: " + (satiety? "Да" : "Нет");
    }

    public String getName() {
        return this.name;
    }
}