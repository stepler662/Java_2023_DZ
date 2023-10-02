package lesson_1_2;

public class CycleApp {
    public static void main(String[] args) {
        //for (иннициализация; условие; иттерация)
        //1-10
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }
        //10-1
        for (int i =10; i > 0; i--){
            System.out.println(i);
        }
        for (int i = 0, j = 10; i < j; j--, i++){
            System.out.println(i + " " + j);
        }
        System.out.println("Вложенный цикл");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" (" + i + " " + j + ") ");
            }
            System.out.println();
        }

        System.out.println("Continue");
        for (int i = 0; i < 11; i++){
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("break");
        for (int i = 0; i < 11; i++){
            if (i > 5) {
                break;
            }
            System.out.println(i);
        }

        //тренировка
        for ( int j = 0; j < 10; j ++){
            System.out.print('*');
        }
        //System.out.println();

    }
}
