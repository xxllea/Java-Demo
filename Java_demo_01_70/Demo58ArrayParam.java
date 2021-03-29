/* 
数组可以作为方法的参数
当调用方法时，向方法的小括号进行传参，传递进去的其实是数组的地址值

*/
public class Demo58ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        
        System.out.println(array); //地址值
        
        printArray(array);  //  传递进去的就是array当中保存的地址值
        System.out.println("======aaa======");
        printArray(array);
        System.out.println("======bbb======");
        }

    public static void printArray(int[] array) {
        System.out.println("printArray方法收到的参数是：");
        System.out.println(array); // 地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}