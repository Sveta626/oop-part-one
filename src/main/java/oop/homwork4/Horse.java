package oop.homwork4;

class Horse implements Transport {
    private int fullPower = 100;

    @Override
    public String getName() {
        return "лошадь";
    }

    @Override
    public boolean canMoveOnTerrain(Terrain terrainType) {
        return !(terrainType.equals(Terrain.SWAMP));
    }


    @Override
    public boolean move(int distance, Terrain terrainType) {
            if(fullPower >= distance * 2) {
                fullPower -= distance * 2;
                System.out.println("Лошадь пробежала " + distance + " км. Осталось сил: " + fullPower + "%");
                return true;
            } else {
                System.out.println("Недостаточно сил у лошади для путешествия на такое расстояние.");
                return false;
            }
    }
}
