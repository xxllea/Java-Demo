
public class Demo68Teacher {
    public static void main(String[] args) {
        Teacher te = new Teacher();

        te.setName("小明");

        te.setAge(20);

        te.setMale(true);
        
        System.out.println("姓名：" + te.getName());

        System.out.println("年龄：" + te.getAge());
        
        System.out.println("是不是爷们：" + te.isMale());
        
    }
}