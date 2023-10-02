package lesson_1_3;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
       int[] intArray = new int[5];

       intArray[3] = 5;
       intArray[1] = 0;
       intArray[0] = 3;

        System.out.println(intArray[3]);

        for(int i = 0; i < 5; i++){
            int value = intArray[i];
            System.out.println("intArray[" + i + "] = " + value);
        }


        int[] arr1 = new int[10];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i * 10;
        }

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr1));

        int[] tenArray = new int[10];
        Arrays.fill(tenArray, 10);
        System.out.println(Arrays.toString(tenArray));


        System.out.println(Arrays.toString(createArrayAndFillIt(8,42)));
        System.out.println(Arrays.toString(createArrayAndFillIt(5,55)));


        boolean[] boolArray = new boolean[5];
        boolArray[2] = true;
        System.out.println(Arrays.toString(boolArray));


        String[] strings = new String[5];
        Arrays.fill(strings, "default value");
        System.out.println(Arrays.toString(strings));


        int[] exampleArr = new int[]{1,2,3};


        //сортировка по возврастанию
        int[] arr7 = {2,2,2,1,2,2,12,8,4,10,1};
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));

    }

    public static int[] createArrayAndFillIt(int length, int valueToFill){
        int[] result = new int[length];
        Arrays.fill(result, valueToFill);
        return result;
    }
}
