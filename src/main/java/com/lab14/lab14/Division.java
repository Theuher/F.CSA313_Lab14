package com.lab14.lab14;

/**
 * Хуваах үйлдлийг гүйцэтгэх класс.
 */
public class Division {
    
    /**
     * Хоёр тоог хуваана.
     *
     * @param dividend хуваагдагч
     * @param divisor хуваагч
     * @return хуваалт
     * @throws IllegalArgumentException хэрэв хуваагч нь тэг бол
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй!");
        }
        return dividend / divisor;
    }
    
    /**
     * Хоёр тоог хувааж, бүхэл хэсгийг буцаана.
     *
     * @param dividend хуваагдагч
     * @param divisor хуваагч
     * @return бүхэл хэсэг
     * @throws IllegalArgumentException хэрэв хуваагч нь тэг бол
     */
    public long divideInteger(double dividend, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй!");
        }
        return (long) (dividend / divisor);
    }
}

