package test2;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println("整型数7的平方值：" + square(7));
        System.out.println("浮点型数7.5的平方值：" + square(7.5));
    }

    public static int square(int intValue) {
        System.out.println("调用int型参数的square方法");
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.println("调用double型参数的square方法");
        return doubleValue * doubleValue;
    }
}