package com.epam.java_basic.array_processor;

/**
 *  Useful methods for array processing
 */
public class ArrayProcessor {


    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int maxNegIndex = -1;
        int minPosIndex = -1;

        // Поиск максимального отрицательного и минимального положительного элементов
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                // Находим максимальный отрицательный элемент
                if (maxNegIndex == -1 || input[i] > input[maxNegIndex]) {
                    maxNegIndex = i;
                }
            } else if (input[i] > 0) {
                // Находим минимальный положительный элемент
                if (minPosIndex == -1 || input[i] < input[minPosIndex]) {
                    minPosIndex = i;
                }
            }
        }

        // Проверка, что оба элемента найдены
        if (maxNegIndex != -1 && minPosIndex != -1) {
            // Меняем местами элементы
            int temp = input[maxNegIndex];
            input[maxNegIndex] = input[minPosIndex];
            input[minPosIndex] = temp;
        }

        return input;
    }


    public int[] countSumOfElementsOnEvenPositions(int[] input) {
        int sum=0;
        for (int i = 0; i <input.length ; i++) {
            sum+=input[i];
        }
        return input;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        throw new UnsupportedOperationException("You need to implement this method");
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        throw new UnsupportedOperationException("You need to implement this method");
    }
}


