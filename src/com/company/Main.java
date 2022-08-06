package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {2.4, -4.7, 6.3, -3.5, -5.7, 4.2, -4.5, 5.2, 7.1, 9.2, 2.7, 5.8, 6.0, 2.0, 7.0};

        double sum = 0;

        int counter = 0;
        boolean start = false;


        for (double value : array) {
            if (value < 0) {
                start = true;
            } else if (value > 0 && start) {
                System.out.println(value);
                if (value > 0) {
                    sum = sum + value;
                    counter++;
                }
            }
        }
        System.out.println("Положительных чисел = " + counter);
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее арифметичекое полож. чисел = " + sum / counter);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp =array [j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}


