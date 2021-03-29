/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。

方法的重载（OverLoad）：多个方法的名称一样，但是参数列表不一样
好处：只需要记住唯一一个方法名称，就可以实现类似的功能

方法重载与下列因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关：
1.与参数的名称无关
2.与方法的返回值类型无关
*/
public class Demo40MethodOverLoad {
    public static void main(String[] args) {
       System.out.println(sum(10, 20)); 
       System.out.println(sum(10, 20, 30));
       System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    /* 错误写法，与方法的返回值无关
    public static double sum(int a, int b) {
        return a + b + 0.0;
    } */

    /* 错误写法，与参数的名称无关
    public static int sum(int x, int y) {
        System.out.println("有2个参数的方法执行！");
        return x + y;
    } */

    public static int sum(double a, double b) {
        System.out.println("有2个参数的方法执行！");
        return (int) (a + b);
    }

    public static int sum(int a, double b) {
        System.out.println("有2个参数的方法执行！");
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        System.out.println("有2个参数的方法执行！");
        return (int) (a + b);
    }

    public static int sum(int a, int b, int c) {
        System.out.println("有3个参数的方法执行！");
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        System.out.println("有4个参数的方法执行！");
        return a + b + c + d;
    }
}