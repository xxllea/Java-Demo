import java.util.ArrayList;

public class Demo83ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("С��");
        list.add("С��");
        list.add("С��");
        System.out.println(list);

        // ��������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}