/*
赋值运算符分为：
基本赋值运算符：就是一个等号“=”，代表将右侧的数据交给左侧的变量
    int a = 30;

复合赋值运算符：
    +=      a += 3  相当于  a = a + 3
    -=      a -= 4  相当于  a = a - 4
    *=      a *= 5  相当于  a = a * 5
    /=      a /= 6  相当于  a = a / 6
    %=      a %= 7  相当于  a = a % 7

注意事项：
    1.只有变量才能使用赋值运算符，常量不能进行赋值。
    2.复合赋值运算符其中隐含了一个强制类型转换。
*/

public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
        // 按照公式进行翻译：a = a + 5
        // a = 10 + 5;
        // a = 15;
        // a本来是10，现在重新赋值得到15
        a += 5;
        System.out.println(a); // 15

        int x = 10;
        // x = x % 3;
        // x = 10 % 3;
        // x = 1;
        // x本来是10，现在重新赋值得到1
        x %= 3;
        System.out.println(x); // 1

        // 50 = 30; // 常量不能进行赋值，不能写在赋值运算符的左边，错误写法！

        byte num = 30;
        num += 5;
        // num = num + 5;
        // num = byte + int
        // num = int + int
        // num = int
        // num = (byte) int
        System.out.println(num); // 35 
    }
}