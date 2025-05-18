package oop.homwork4;

interface Transport {
        boolean canMoveOnTerrain(Terrain terrainType);//может передвигаться по пересеченной местности
        boolean move(int distance, Terrain terrainType);
        String getName();//расстояние, тип местности


}
