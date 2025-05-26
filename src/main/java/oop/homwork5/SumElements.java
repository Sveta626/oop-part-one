package oop.homwork5;

public class SumElements {
    public static int sumElements(String[][] args) throws AppArraySizeException, AppArrayDataException {
        if (args.length != 4 || args[0].length != 4 || args[1].length != 4 || args[2].length != 4 || args[3].length != 4)
            throw new AppArraySizeException("Размер массива должен быть 4x4");

        int totalSum = 0;

        for (int i = 0; i < args.length; i++) {
            for (int j = 0; args[i].length > j; j++)
                try {
                    totalSum += Integer.parseInt(args[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка при преобразовании элемента под индексами " + i + " " + j);
                }
        }

        return totalSum;


    }
}

