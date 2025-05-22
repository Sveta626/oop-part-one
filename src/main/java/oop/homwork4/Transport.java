package oop.homwork4;

interface Transport {
    boolean canMoveOnTerrain(Terrain terrainType);

    boolean move(int distance, Terrain terrainType);

    String getName();


}
