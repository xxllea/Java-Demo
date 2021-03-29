/*
while循环有一个标准格式，还有一个扩展格式：

标准格式：
while (条件判断) {
    循环体
}

扩展格式：
初始化语句;
while (条件判断) {
    循环体;
    步进语句;
}
*/
public class Demo24While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld " + i);
        }
        System.out.println("程序停止");
        // System.out.println(i); // 错误！超过变量作用域
        System.out.println("=============");

        int i = 1;
        while (i <= 10) {
            System.out.println("HelloWorld " + i);
            i++;
        }
        System.out.println(i);
    }
}