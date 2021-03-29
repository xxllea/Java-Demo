import java.util.ArrayList;

/* 
题目：
自定义4个学生对象，添加到集合，并遍历。

思路：
1.自定义Student学生类，四个部分：成员变量全用private，无参构造，全参构造，Getter/Setter
2.创建一个集合，用来存储学生对象。泛型：<Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合中：add
5.遍历集合：for\size

*/
public class Demo86ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        Student st1 = new Student("小红", 16);
        Student st2 = new Student("小蓝", 15);
        Student st3 = new Student("小黄", 18);
        Student st4 = new Student("小黑", 19);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println(list);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄" + stu.getAge());
        }
    }
}