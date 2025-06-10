
import oop.homwork8.Sorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayBubble = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arrayBubble));

        Sorter.bubbleSort(arrayBubble);
        System.out.println("\nОтсортирован пузырьковым методом:");
        System.out.println(Arrays.toString(arrayBubble));

        int[] arrayQuick = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nИсходный массив:");
        System.out.println(Arrays.toString(arrayQuick));

        Sorter.quickSort(arrayQuick);
        System.out.println("\nОтсортирован быстрым методом:");
        System.out.println(Arrays.toString(arrayQuick));
    }

    }













