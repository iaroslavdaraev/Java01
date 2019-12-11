package ru.geekbrains.java_one.lesson_02.online;

import java.util.Arrays;

public class Lesson2 {
    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] ^= 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3 + 1;
        }
    }

    public static void change2(int[] arr) {
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++) {
            if(i < 6)
                arr1[i] *= 2;
        }
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int index : arr)
            if (index < min)
                min = index;
        return min;
    }
}