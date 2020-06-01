package day03.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //单独调用
        int a,b;
        sum(a=10,b=20);
        System.out.println("==========");
        //打印调用
        System.out.println(sum(a=10,b=20));
        System.out.println("==========");
        //赋值调用
        int number=sum(a=20,b=30);
        number+=100;
        System.out.println("变量的值"+number);
    }

    public static int sum(int a, int b) {
        System.out.println("方法执行了！");
        int result = a + b;
        return result;
    }
}
