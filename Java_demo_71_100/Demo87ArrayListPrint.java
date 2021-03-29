import java.util.ArrayList;

/* 
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分隔每个元素
格式参照 {元素@元素@元素}。

System.out.println(list);   [10, 20, 30]
printArrayList(lsit);       {10@20@30}
*/
public class Demo87ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小黄");
        list.add("小蓝");
        System.out.println(list); // [小明, 小黄, 小蓝]
        printArrayList(list);
    }
    /* 
    定义方法的三要素
    返回值类型：只是进行打印而已，没有运算，没有结果；所以用void
    方法名称：printArrayList
    参数列表：ArrayList
    */
    public static void printArrayList(ArrayList<String> list) {
        // {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }

}