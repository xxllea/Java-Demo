/* 
���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ��������������ڵ��ࡣ���������ͬһ�����ݡ�
���������Ʒ��ʾ�̬��Ա������ʱ��ȫ�̺Ͷ����û��ϵ��ֻ�����й�ϵ
*/
public class Demo98StaticField {
    public static void main(String[] args) {
        Boy one = new Boy("С��", 22);
        Boy.room = "101����";
        System.out.println("������" + one.getName()
                 + ",���䣺" + one.getAge() + ",���ң�" + one.room
                 + ",ѧ�ţ�" + one.getId());
        Boy two = new Boy("С��", 23);
        System.out.println("������" + two.getName()
                 + ",���䣺" + two.getAge() + ",���ң�" + two.room
                 + ",ѧ�ţ�" + two.getId());
    }
}