/*  
题目：
定义一个数组，用来存储三个Girl对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。
*/
public class Demo80Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3的数组，里面用来存放Girl类型的对象
        Girl[] array = new Girl[3];

        Girl one = new Girl("小明", 22);
        Girl two = new Girl("小黄", 30);
        Girl three = new Girl("小红", 33);

        // 将one当中的地址值赋值到数组的0号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(array[1].getName());
    }
}