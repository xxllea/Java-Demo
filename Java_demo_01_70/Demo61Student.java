/* 
ͨ������£�һ���ಢ����ֱ��ʹ�ã���Ҫ�����ഴ��һ�����󣬲���ʹ��

1.������Ҳ����ָ����Ҫʹ�õ��࣬��ʲôλ��
import ������.������;
import ������.Student;
���ں͵�ǰ������ͬһ���������������ʡ�Ե�����䲻д��

2.��������ʽ��
������ ������ = new ������();
Student stu = new Student();

3.ʹ�ã������������
ʹ�ó�Ա������������.��Ա������
ʹ�ó�Ա������������.��Ա������(����);
��Ҳ���ǣ�����˭�����ö��������˭����

ע�����
�����Ա����û�н��и�ֵ����ô������һ��Ĭ��ֵ�����������һ����    
*/

public class Demo61Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.age); // 0
        System.out.println(stu.name); // null 
        System.out.println("=================");
        
        // �ı�����еĳ�Ա������ֵ����
        // ���Ҳ���ַ�������ֵ����stu�����е�name��Ա
        stu.name = "xxllea";
        stu.age = 18;
        System.out.println(stu.name); // xxllea
        System.out.println(stu.age); // 18
        System.out.println("================");

        // ʹ�ö���ĳ�Ա��������ʽ��
        // ������.��Ա������()

        stu.eat();
        stu.sleep();
        stu.study(); 
    }
}