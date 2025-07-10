package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        lesson1.printThreeWords();
        lesson1.checkSumSign();
        lesson1.printColor();
        lesson1.compareNumbers();
        System.out.println(lesson1.twoNumbers(6, 22));
        lesson1.plusminus(-5);
        System.out.println(lesson1.number(44));
        lesson1.razraz("dfgdfgdf", 4);
        System.out.println(lesson1.year(2000));
        int[] arr = new int[]{1, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.println(arr2[i]);
        }
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.println(arr3[i]);
        }
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                System.out.println(table[i][j] + "");
            }
        }
       lesson1.array(3,3);
    }
}