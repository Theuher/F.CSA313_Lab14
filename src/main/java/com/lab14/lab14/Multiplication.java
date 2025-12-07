package com.lab14.lab14;

/**
 * Үржүүлэх үйлдлийг гүйцэтгэх класс.
 */
public class Multiplication {
    
    /**
     * Хоёр тоог үржүүлнэ.
     *
     * @param a эхний тоо
     * @param b хоёр дахь тоо
     * @return үржвэр
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Олон тоог үржүүлнэ.
     *
     * @param numbers үржүүлэх тоонууд
     * @return үржвэр
     */
    public double multiplyMultiple(double... numbers) {
        if (numbers.length == 0) {
            return 1.0;
        }
        double result = 1.0;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }
}

