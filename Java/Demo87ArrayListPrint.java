import java.util.ArrayList;

/* 
��Ŀ��
������ָ����ʽ��ӡ���ϵķ�����ArrayList������Ϊ��������ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ��
��ʽ���� {Ԫ��@Ԫ��@Ԫ��}��

System.out.println(list);   [10, 20, 30]
printArrayList(lsit);       {10@20@30}
*/
public class Demo87ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("С��");
        list.add("С��");
        list.add("С��");
        System.out.println(list); // [С��, С��, С��]
        printArrayList(list);
    }
    /* 
    ���巽������Ҫ��
    ����ֵ���ͣ�ֻ�ǽ��д�ӡ���ѣ�û�����㣬û�н����������void
    �������ƣ�printArrayList
    �����б�ArrayList
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