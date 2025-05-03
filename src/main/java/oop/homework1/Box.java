package oop.homework1;

public class Box {
    private String size;
    private String color;
    private boolean isOpen;
    private String predmet;

    public Box(String size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = false;
        this.predmet = null;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Вы открыли коробку");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Вы закрыли коробку");
    }

    public void putIn(String str) {
        if (this.isOpen == false) {
            System.out.println("Коробка закрыта, нельзя положить предмет");
        }
        if (this.predmet != null) {
            System.out.println("В коробке уже лежит предмет, нельзя положить предмет");
        }
        if (this.isOpen == true && this.predmet == null) {
            this.predmet = str;
            System.out.println("Положили предмет");
        }
    }

    public void putOut() {
        if (this.isOpen == true && this.predmet != null) {
            this.predmet = null;
            System.out.println("Выложили предмет");
        }
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getPredmet() {
        return predmet;
    }

}

