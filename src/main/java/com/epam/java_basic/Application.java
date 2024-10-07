package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

import static java.lang.Integer.*;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        int [] array = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        int [] result = processor.swapMaxNegativeAndMinPositiveElements(array);

//        System.out.println("Изменяемный Массив: ");
//        for (int i: result) {
//            System.out.println(i+" ");
//        }
//        float num = 4.35f;
//        System.out.println("Result:"+ num);

        ArrayProcessor countSum = new ArrayProcessor();
        int [] count = countSum.countSumOfElementsOnEvenPositions(array);

        for (int i = 0; i <array.length ; i++) {

        }



        System.out.println(count);
    }
}

//Шаблон
//        int[] arr = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//        int[] arr = new int[]{2, 4, 6, 8, 10};
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < arr[i - 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i - 1];
//                arr[i] = temp;
//            }
//            System.out.println(arr[i]);
//
//        }


////В массиве целых чисел определить сумму элементов, стоящих на чётных позициях
//int [] arr = new int [] {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//int sum=0;
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] % 2 == 0) {
//sum=sum+arr[i];
//        }
//
//        }
//        System.out.println(sum);
//
//    }


////В массиве целых чисел заменить нулями отрицательные элементы
//int[] arr = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//        for (int i = 0; i <arr.length ; i++) {
//        if (arr[i] < 0) {
//arr[i] = 0;
//        }
//        System.out.println(arr[i]);
//        }
//

        //       В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным
//        int[] arr = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > 0 && arr[i + 1] < 0) {
//                arr[i] *= 3;
//            }
//            System.out.println(arr[i]);
//        }
//
//    }
//}


        //        В массиве целых чисел найти разницу между средним арифметическим и значением минимального элемента
//
//        int[] arr = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//        int avg = 0;
//        int sum = 0;
//        int min = 0;
//        for (int i = 0; i <arr.length ; i++) {
//            if (arr[i] < min) {
//                min= arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println("Сумма "+sum);
//        avg = sum/arr.length;
//        System.out.println("Среднее Значение "+avg);
//        System.out.println("Минимальное "+min);
//        int res = avg-min;
//        System.out.println("разницу между средним арифметическим и значением минимального элемента "+ res);
//
//    }
//
//}





