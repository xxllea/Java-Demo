/* 
��������������Person������ʱ���޷���ֹ���������ֵ�����ý����� 
�����������private�ؼ��ֽ���Ҫ�����ĳ�Ա�����������Ρ�

һ��ʹ��private�������Σ���ô���൱����Ȼ����������ʡ�
���ǣ������˱��෶Χ֮��Ͳ���ֱ�ӷ����ˡ�

��ӷ���private��Ա���������Ƕ���һ�Զ�Getter/Setter����

�����setXXX������getXXX��������
����Getter��˵�������в���������ֵ���ͺͳ�Ա������Ӧ��
����Setter��˵�������з���ֵ���������ͺͳ�Ա������Ӧ��
*/

/* 
�������ľֲ���������ĳ�Ա����������ʱ�򣬸��ݡ��ͽ�ԭ�򡱣�����ʹ�þֲ�������
�����Ҫ���ʱ��൱�еĳ�Ա��������Ҫʹ�ø�ʽ��
this.��Ա������ (thisֻ��д�ڷ������ڲ�)
��˭���÷�����˭����this��
*/
public class Person {
    String name; // ����
    private int age; // ����

    // ����name�ǶԷ�������
    // ��Ա����name���Լ�������
    public void sayHello(String name) {
        System.out.println(name + ",��á�����" + this.name);
        System.out.println(this);
    }

    public void show() {
        System.out.println("�ҽУ�" + name + "\n���䣺" + age);
    }

    // �����Ա������ר��������age��������
    public void setAge(int num) {
        if (num < 100 && num > 0) {
            age = num;
        } else {
            System.out.println("���ݲ�����");
        }
    }

    // �����Ա������ר�Ż�ȡage����
    public int getAge() {
        return age;
    }
}