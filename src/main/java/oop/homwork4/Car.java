package oop.homwork4;

class Car implements Transport {
    private int fuelLevel = 100;

    @Override
    public String getName() {
        return "машина";
    }

    @Override
    public boolean canMoveOnTerrain(Terrain terrainType) {
        return !(terrainType.equals(Terrain.FOREST) || terrainType.equals(Terrain.SWAMP));
    }


    @Override
    public boolean move(int distance, Terrain terrainType) {
            if(fuelLevel >= distance * 0.5) {
                fuelLevel -= distance * 0.5;
                System.out.println("Машина прошла " + distance + " км. Осталось топлива: " + fuelLevel + "%");
                return true;
            } else {
                System.out.println("Недостаточно топлива для путешествия на такое расстояние.");
                return false;
            }
    }
}
