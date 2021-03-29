import java.util.ArrayList;

public class Demo83ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小红");
        list.add("小黄");
        list.add("小明");
        System.out.println(list);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}