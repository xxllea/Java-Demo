/* 
һ��ʹ��static���γ�Ա��������ô��ͳ�Ϊ�˾�̬��������̬���������ڶ��󣬶���������ġ�

���û��static�ؼ��֣���ô�������ȴ�������Ȼ��ͨ���������ʹ������
�������static�ؼ��֣���ô����Ҫ��������ֱ�Ӿ���ͨ����������ʹ������

�����ǳ�Ա���������ǳ�Ա�������������static,���Ƽ�ʹ�������ƽ��е��á�
��̬������������.��̬����
��̬������������.��̬��������

ע�����
1.��ֻ̬��ֱ�ӷ��ʾ�̬������ֱ�ӷ��ʷǾ�̬��
ԭ����Ϊ���ڴ浱���ǡ��ȡ��еľ�̬���ݣ������еķǾ�̬����
2.��̬�������в�����this.
ԭ��this������ǰ����ͨ��˭���õķ�����˭���ǵ�ǰ����
*/
public class Demo99StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // ���ȴ�������
        // Ȼ�����ʹ��û��static�ؼ��ֵ�����
        obj.method();

        // ���ھ�̬������˵������ͨ�����������е��ã�Ҳ����ֱ��ͨ�������������á�
        obj.methodStatic(); // ��ȷ�����Ƽ�������д���ڱ���֮��Ҳ�ᱻjavac�����Ϊ������.��̬����
        MyClass.methodStatic(); // ��ȷ���Ƽ�

        // ���ڱ��൱�еľ�̬����������ʡ��������
        myMethod();
        Demo99StaticMethod.myMethod(); // ��ȫ��Ч
    }

    public static void myMethod() {
        System.out.println("�Լ��ķ�����");
    }
}