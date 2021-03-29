// 三元运算符可以和if-else等效替换
// 例子：取两个数字当中的最大值

public class Demo20Max {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       
       // 首先使用三元运算符 
       // int max = a > b ? a : b;

       // 使用if语句
       int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("最大值：" + max);
    }
}