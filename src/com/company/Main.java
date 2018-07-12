package com.company;
import java.util.Scanner;

public class Main {
    /**
     * Главный метод программы. Принимает два числа и выводит их сумму на экран, округляя дробную часть до 4 знаков.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = in.nextDouble();
        System.out.println("Enter the second number:");
        double b = in.nextDouble();
        double sum = a + b;
        System.out.printf("Sum is:" + "%.4f", sum);

    }
}
