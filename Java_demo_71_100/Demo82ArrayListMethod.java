import java.util.ArrayList;

/* 
ArrayList当中常用的方法有：

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其它集合（今后学习）来说，add添加动作不一定成功。
public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。
public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。
public int size()：获取集合的尺寸长度，返回值是集合当中包含的元素个数。
*/
public class Demo82ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
         
        // 向集合添加元素：add
        boolean success = list.add("小明");
        System.out.println(list); // 
        System.out.println("添加的动作是否成功：" + success);

        list.add("小垃圾");
        list.add("小辣椒");
        System.out.println(list); 

        // 从集合中获取元素：get:索引值从0开始
        String name = list.get(2);
        System.out.println(name);

        // 从集合删除元素：remove:索引值从0开始
        // String whoRemoved = list.remove(1);
        // list.remove(0);
        // System.out.println(whoRemoved);
        System.out.println(list.remove(0));
        System.out.println(list); 

        // 获取集合长度,也就是其中元素的个数
        // int size = list.size();
        System.out.println(list.size());
    }
}