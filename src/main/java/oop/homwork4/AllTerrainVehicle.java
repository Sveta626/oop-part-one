package oop.homwork4;

class AllTerrainVehicle implements Transport {
    private int fuelLevel = 100;

    @Override
    public String getName() {
        return "вездеход";
    }

    @Override
    public boolean canMoveOnTerrain(Terrain terrainType) {
        return true;
    }


    @Override
    public boolean move(int distance, Terrain terrainType) {
            if(fuelLevel >= distance * 1) {
                fuelLevel -= distance * 1;
                System.out.println("Вездеход прошел " + distance + " км. Осталось топлива: " + fuelLevel + "%");
                return true;
            } else {
                System.out.println("Недостаточно топлива для путешествия на такое расстояние.");
                return false;
            }
    }
}
