package org.example;

public class lesson1 {
//1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
//2
    public static void checkSumSign() {
        int a = -10, b = 50;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
//3
    public static void printColor() {
        int value = 222;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
//4
    public static void compareNumbers() {
        int a = 5, b = 55;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
//5
    public static boolean twoNumbers(int a, int b) {
        return a + b > 10 && a + b < 20;

    }
//6
    public static void plusminus(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
//7
    public static boolean number(int a) {
        if (a < 0) return false;
        else return true;
    }
//8
    public static void razraz(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
//9
    public static boolean year(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }
//10
    public static void invertArray () {
        int[] arr = new int[]{1, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
            System.out.print(arr[i]);
        }
    }
//11
    public static void fillArray () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
//12
    public static void lesssix () {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]);
        }
    }
//13
    public static void diagonal () {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][table.length - i - 1] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                System.out.println(table[i][j]);
            }
        }
    }
//14
    public static int[] array(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }
        return arr;
    }
}
