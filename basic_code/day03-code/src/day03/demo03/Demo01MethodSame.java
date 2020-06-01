package day03.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(20,10));
        System.out.println(isSame(10,20));
    }

    public static boolean isSame(int a, int b) {
        boolean same;
        same = a == b;
        return same;
    }
}
