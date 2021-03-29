public class Demo01Const {
    public static void main(String[] args) {
        //字符串常量

        System.out.println("ABC");
        System.out.println(""); //双引号中间内容为空
        //整数常量

        System.out.println(30);
        System.out.println(50);
        
        //浮点数常量
        System.out.println(3.14);
        System.out.println(-2.5);

        //字符常量
        System.out.println('0');
        System.out.println('A');
        
        /* 
        错误：System.out.println('') 
        错误：System.out.println('AB') 
         两个单引号有且仅有1个字符，否则报错 
        */

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        // 空常量不能用于打印输出
        //错误：System.out.println(null);
    }
}

/* 
  计算机有常量和变量的概念
  常量：在程序运行期间，固定不变的量
  常量的分类：
    1、字符串常量 "abc" "hello" 凡是双引号引起来的部分，叫做字符串常量
    2、整数常量 100 200 0
    3、浮点数常量 2.5 -3.14 0.0
    4、字符常量  'a' '9' 'C'凡是用单引号引起来的单个字符，叫字符常量
    5、布尔常量 只有两种取值 true flase 
    6、空常量 null 代表没有任何数据 
*/