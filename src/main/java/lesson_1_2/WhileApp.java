package lesson_1_2;

public class WhileApp {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            System.out.println(i);
            i = i - 2;
        }

        int j = 10;
        while (j < 100){
            if (j > 50){
                break;
            }
            System.out.println(j);
            j += 10;
        }

        int k = 0;
        do{
            System.out.println(k);
            k += 5;
        } while(k < 20);

    }
}
