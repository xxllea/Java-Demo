
public class Demo70Dog {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); // �޲ι���
        System.out.println("==========");
        Dog dog2 = new Dog("С��", 5); // ȫ�ι���
        System.out.println("������" + dog2.getName() + ",���䣺" + dog2.getAge());
        // �����Ҫ�ı�����еĳ�Ա�����������ݣ���Ȼ����Ҫʹ��setXXX����
        dog2.setAge(6);
        System.out.println("������" + dog2.getName() + ",���䣺" + dog2.getAge());

    }
}