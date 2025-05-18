package oop.homwork4;


public class Person {
    private String name;
    private Transport currentTransport;
    private int power;

    public Person(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
        System.out.println(this.name + " сел за транспорт "+ currentTransport.getName());
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public boolean move(int distance, Terrain terrainType) {
        if (currentTransport == null) {
            System.out.println(getName() + " идет пешком");
            return true;
        }

        if(currentTransport.canMoveOnTerrain(terrainType) == true) {
            return currentTransport.move(distance, terrainType);
        } else {
            return false;

        }
    }
}
