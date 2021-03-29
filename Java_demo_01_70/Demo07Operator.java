public class Demo07Operator {
    public static void main(String[] args) {
        // 两个常量之间可以进行数学运算
        // 首先计算表达式的结果，然后再打印输出这个结果
        System.out.println(20 + 30); 

        // 两个变量之间可以进行数学运算
        int a = 20;
        int b = 30 ;
         System.out.println(a - b); // -10

         // 变量和常量之间混合使用
         System.out.println(a * 10); // 200

         int x = 10;
         int y = 3;

         // 对于一个整数的表达式来说，除法用的是整除，整数除以整数，结果仍然是整数。只看商，不看余数
         int result1 = x / y;
         System.out.println(result1); // 3

         int result2 = x % y;
         System.out.println(result2); // 余数，模，1

         // int + double --> double + double --> double
         double result3 = x + 2.5;
         System.out.println(result3); // 12.5



    }
}