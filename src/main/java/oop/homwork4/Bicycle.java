package oop.homwork4;

class Bicycle implements Transport {
   private Person person;


    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return "велосипед";
    }

    @Override
    public boolean canMoveOnTerrain(Terrain terrainType) {
        return !(terrainType.equals(Terrain.SWAMP));
    }


    @Override
    public boolean move(int distance, Terrain terrainType) {
            if(person.getPower() >= distance * 0.5) {
                person.setPower((int) (person.getPower() - distance * 0.5));
                System.out.println("Велосипед проехал " + distance + " км. Осталось сил: " + person.getPower() + "%");
                return true;
            } else {
                System.out.println("Недостаточно сил " + person.getName() + " для путешествия на такое расстояние.");
                return false;
            }
    }
}
