
public class Demo71Student {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("С��");
        stu1.setAge(20);
        System.out.println("������" + stu1.getName() + ",���䣺" + stu1.getAge());
        System.out.println("==========");

        Student stu2 = new Student("С��", 20);
        stu2.setName("С��");
        stu2.setAge(18);
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
        stu2.setAge(30);
        System.out.println("==========");
        System.out.println("������" + stu2.getName() + ",���䣺" + stu2.getAge());
    } 
}