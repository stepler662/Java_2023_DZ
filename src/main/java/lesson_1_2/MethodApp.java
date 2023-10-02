package lesson_1_2;

public class MethodApp {
    public static void main(String[] args) {
        //int calc1 = calculate(4,2);
        //int calc2 = calculate(10,20);
        int calc3 = calculate(662);
        System.out.println(calc3);
        int calc5 = calculate(calculate(4,2),calculate(10,20));
        //<modifier> <type> <name> (<params> 0..n)
        method1("texttext", 662);
        method1(555, "text2");

    }

    public static void doSomeThing() {
        System.out.println("something");
    }

    static int calculate(int a, int b) {
        return 2*a + b;
    }

    static int calculate(int a){
        return calculate(a,a);
    }

    public static void method1(String s, int i){
        System.out.println("method1 " + s + " " + i);
    }

    public static void method1(int i, String s){
        System.out.println("method1 " + s + " " + i);
    }

}
