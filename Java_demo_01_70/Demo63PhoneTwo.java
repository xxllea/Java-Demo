
public class Demo63PhoneTwo {
    public static void main(String[] args) {
        // ����Phone�࣬����һ����Ϊone�Ķ���
        // ��ʽ�������� ������ = new ������();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("=========");

        one.brand = "ƻ��";
        one.price = 8388.0;
        one.color = "black";

        System.out.println(one.brand); // ƻ��
        System.out.println(one.price); // 8388.0
        System.out.println(one.color); // black
        System.out.println("=========");

        one.call("xxllea");
        one.sendMessage();
        System.out.println("=========");

        Phone two = one;
        System.out.println(two.brand); // null
        System.out.println(two.price); // 0.0
        System.out.println(two.color); // null
        System.out.println("=========");

        two.brand = "����";
        two.price = 5999.0; 
        two.color = "blue";

        System.out.println(two.brand); // ����
        System.out.println(two.price); // 5999.-
        System.out.println(two.color); // blue
        System.out.println("=========");

        two.call("haha");
        two.sendMessage();
    }
}