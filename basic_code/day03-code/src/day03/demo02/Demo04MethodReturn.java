package day03.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(20, 30);
        System.out.println("返回值是:" + num);
        System.out.println("=================");
        printSum(50,80);
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a * b;
        System.out.println("结果是:"+result);
    }
}
