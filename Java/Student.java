/* 
һ����׼����ͨ��Ҫӵ�������ĸ���ɲ��֣�

1.���еĳ�Ա������Ҫʹ��private�ؼ�������
2.Ϊÿһ����Ա������дһ�Զ�Getter/Setter����
3.��дһ���޲����Ĺ��췽��
4.��дһ��ȫ�����Ĺ��췽��

������׼����Ҳ����Java Bean
*/
public class Student {
    private String name; // ����
    private int age; // ����

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
