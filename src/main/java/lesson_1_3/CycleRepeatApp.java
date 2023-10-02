package lesson_1_3;

public class CycleRepeatApp {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


        System.out.println("NEW3");

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if (i == 0 || i == 5 || j == 0 ||j == 5){
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("NEW4");

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                if ((i + j) % 2 == 0){
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("New5");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
               if (i > j){
                   System.out.print("* ");
               }else if (i < j){
                   System.out.print("0 ");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }


        System.out.println("New6");

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i == 0 || i == 5 || j == 0 || j == 5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("New7");
        for (int i = 0; i  <  6; i++){
            for (int j = 0; j < 6; j++){
                if(i == 0 || i == 5 || j == 0 || j == 5 || i == j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("New8");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if (i == 5 || j == 0 || i == j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("New9");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if((i == 2 && j == 2) || (i == 3 && j ==3) || (i == 3 && j == 2) || (i == 2 && j == 3)){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("New9.1");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i == 0 || i == 1 || i == 4 || i == 5 || j == 0 || j == 1 || j == 4 || j == 5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println("New10");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i == 2 || i == 3 || j == 2 || j == 3 || i == j || (i == 1 && j == 0) || (i == 0 && j == 1) ||
                        (i == 4 && j == 5) || (i == 5 && j == 4)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}