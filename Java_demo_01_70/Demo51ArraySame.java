/*
java的内存需要划分为
1.栈（Stack）：存放的都是方法中的局部变量。方法的运行一定要在栈当中运行。
    局部变量：方法的参数，或者是方法{}内部的变量
    作用域：一旦超出作用域，立刻从栈内存当中消失。
2.堆（Heap）：凡是new出来的东西，都在堆当中。
    堆内存里面的东西都有一个地址值：16进制
    堆内存里面的数据，都有默认值。规则：
        如果是整数      默认为0
        如果是浮点数    默认为0.0
        如果是字符      默认为'\u0000'
        如果是布尔      默认为false
        如果是引用类型   默认为null
3.方法区（Method Area）：存储.class相关信息，包含方法的信息。
4.本地方法栈（Native Method Stack）：与操作系统相关。
5.寄存器（pc Register）:与CPU相关。
*/
public class Demo51ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3]; // 动态初始化
        System.out.println(arrayA); // 地址值
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        System.out.println("=============");

        // 改变数组当中元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 10
        System.out.println(arrayA[2]); // 20
        System.out.println("=============");

        // 将arrayA数组的地址值，赋值给arrayB数组
        int[] arrayB = arrayA; // 动态初始化
        System.out.println(arrayB); // 地址值
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 10
        System.out.println(arrayB[2]); // 20
        System.out.println("=============");

        // 改变数组当中元素的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);
        System.out.println(arrayB[0]); // 0
        System.out.println(arrayB[1]); // 100
        System.out.println(arrayB[2]); // 200
        
        System.out.println("=============");
        System.out.println(arrayA); // 地址值
        System.out.println(arrayA[0]); // 0
        System.out.println(arrayA[1]); // 0
        System.out.println(arrayA[2]); // 0
        


    }
}
