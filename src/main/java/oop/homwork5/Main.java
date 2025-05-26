package oop.homwork5;

public class Main {
    public static void main(String[] args) {
        String[][] data = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try {
            System.out.println("Сумма элементов массива: " + SumElements.sumElements(data));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e);
        }
        String[][] data2 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"f", "14", "15", "16"}};

        try {
            System.out.println("Сумма элементов массива: " + SumElements.sumElements(data2));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println(e);
        }
    }

}









