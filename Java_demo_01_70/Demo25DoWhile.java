/*
do-while循环的标准格式：

do {

} while (条件判断);

扩展格式：

初始化语句
do {
    循环体
    步进表达式
} while (条件判断);
*/
public class Demo25DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld " + i);
        }
        System.out.println("程序停止");
        System.out.println("==============");

        int i = 1; // 初始化语句
        do {
            System.out.println("HelloWorld " + i); // 循环体
            i++; // 4.步进语句
        } while (i <= 10); // 条件判断
        System.out.println(i); 
    }
}