package hw1_2;

public class HomeWork1_2 {
    public static void main(String[] args) {
        System.out.println(checkSum(4,11));
        checkPositiveOrNegative(-5);
        System.out.println(checkTruOrFalse(10));
        method4("Строка", 7);
        int year = 2023;
        boolean isLeap = leapYear(year);

        if (isLeap){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задача №1
    public static boolean checkSum (int a, int b ){
        int sum = a + b;
        return (sum >= 10) && (sum <= 20);
    }

    //Задача №2
    public static void checkPositiveOrNegative(int a){
        if (a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    //Задача №3
    public static boolean checkTruOrFalse (int a){
        return (a < 0);
    }

    //Задача №4
    public static void method4(String s, int n){
        for (int i = 0; i <= n; i++){
            System.out.println(s);
        }
    }
    //Задача №5
    public static boolean leapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

    }



}
