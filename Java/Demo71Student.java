
public class Demo71Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("小明");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());
        System.out.println("==========");

        Student stu2 = new Student("小明", 20);
        stu2.setName("小红");
        stu2.setAge(18);
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
        stu2.setAge(30);
        System.out.println("==========");
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
    } 
}