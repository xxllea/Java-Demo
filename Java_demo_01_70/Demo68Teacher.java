
public class Demo68Teacher {
    public static void main(String[] args) {
        Teacher te = new Teacher();

        te.setName("С��");

        te.setAge(20);

        te.setMale(true);
        
        System.out.println("������" + te.getName());

        System.out.println("���䣺" + te.getAge());
        
        System.out.println("�ǲ���ү�ǣ�" + te.isMale());
        
    }
}