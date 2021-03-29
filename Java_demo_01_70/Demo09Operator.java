/*
自增：++
自减：--

含义：让一个变量涨一个数字1,或者让一个变量降一个数字1
使用格式：写在变量名称之前，或者写在变量名称之后。例如：++num, num++, --num, num--
使用方式：
    1.单独使用：不和其它任何操作混合，自己独立成为一个步骤。
    2.混合使用：和其它操作混用，例如与赋值混合，或者与打印操作混合，等。
使用区别：
    1.在单独使用的时候，前++和后++没有任何区别。也就是：++num;和num++;是完全一样的
    2.在混合使用时候，有【重大区别】
        A.如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用。  【先加后用】
        B.如果是【后++】，那么首先使用变量本来的数值，【然后再让变量+1】。【先用后加】

注意事项：
    只有变量才能使用自增、自减运算符。常量不可发生改变，所以不能用。
*/

public class Demo09Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        ++num1; // 单独使用，前++
        System.out.println(num1); // 11
        num1++; // 单独使用，后++
        System.out.print(num1);  // 12
        System.out.println("=============="); 

        // 与打印语句混合的时候
        int num2 = 20;
        // 混合使用，先++，变量立刻马上变成21，然后打印结果21
        System.out.println(++num2); // 21
        System.out.println(num2);  // 21
        System.out.println("=============="); 

        int num3 = 30;
        // 混合使用，后++，首先使用变量本来的30，然后
        System.out.println(num3++); // 30
        System.out.println(num3); // 31
        System.out.println("=============="); 

        int num4 = 40;
        // 和赋值操作1混合
        int result1 = --num4; // 混合使用，前--，变量立刻马上-1变成39，然后将结果交给result1变量
        System.out.println(result1); // 39
        System.out.println(num4); // 39
        System.out.println("=============="); 

        int num5 = 50;
        // 混合使用，后--，首先把本来的数字50交给result2,然后我自己再-1变成49
        int result2 = num5--; 
        System.out.println(result2); // 50
        System.out.println(num5); // 49
        System.out.println("=============="); 

        int x = 10;
        int y = 20;
        // 11 + 20 = 31 
        int result3 = ++x + y--;
        System.out.println(result3); // 31
        System.out.println(x);  // 11
        System.out.println(y);  // 19

        // 20++； // 错误写法，常量不可使用++或-- 
    }
}