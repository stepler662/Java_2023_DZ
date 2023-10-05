package lesson_1_3;

import java.util.Arrays;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        int counter = 1;
        int[][] TwoDimensionArray = new int [3][4];
        for(int i = 0; i < TwoDimensionArray.length; i++){
            for(int j = 0; j < 4; j++){
                TwoDimensionArray[i][j] = counter;
                System.out.print(TwoDimensionArray[i][j] + " ");
                counter++;
            }System.out.println();
        }


        System.out.println("Нерегулярные массивы");
        System.out.println(" ");

        int[][] table = new int [3][];
        table[0] = new int[1];
        table[1] = new int[5];
        table[2] = new int[3];
        System.out.println(Arrays.toString(table));


        System.out.println("Получение длины массива");
        System.out.println(" ");

        int[] arr = {2, 4, 5, 1, 2 ,3, 4, 5};
        System.out.println("arr.length: " + arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println("Ввод данных из консоли");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
        int a = sc.nextInt(); //чтение целого числа в переменную а
        String b = sc.nextLine(); //чтение введенной строки
        String c = sc.next(); // слово до следующего пробела
        sc.close(); // после завершения работы со сканером его необходимо закрыть



    }
}
