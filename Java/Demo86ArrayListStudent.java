import java.util.ArrayList;

/* 
��Ŀ��
�Զ���4��ѧ��������ӵ����ϣ���������

˼·��
1.�Զ���Studentѧ���࣬�ĸ����֣���Ա����ȫ��private���޲ι��죬ȫ�ι��죬Getter/Setter
2.����һ�����ϣ������洢ѧ�����󡣷��ͣ�<Student>
3.�����࣬����4��ѧ������
4.��4��ѧ��������ӵ������У�add
5.�������ϣ�for\size

*/
public class Demo86ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
        Student st1 = new Student("С��", 16);
        Student st2 = new Student("С��", 15);
        Student st3 = new Student("С��", 18);
        Student st4 = new Student("С��", 19);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        System.out.println(list);

        // ��������
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("������" + stu.getName() + "������" + stu.getAge());
        }
    }
}