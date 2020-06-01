package day03.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(66,88));
        System.out.println(sum(66,88,99));
        System.out.println(sum(66,77,88,99));
    }
    public static int sum(int a,int b){
        System.out.println("有2个参数的方法执行！");
        return a+b;
    }    public static int sum(int a,int b,int c){
        System.out.println("有3个参数的方法执行！");
        return a+b+c;
    }    public static int sum(int a,int b,int c,int d){
        System.out.println("有4个参数的方法执行！");
        return a+b+c+d;
    }
}
