/*
���ֺ��ַ��Ķ��չ�ϵ���������

ASCII���American Standard Code for Information Interchange,������Ϣ������׼���롣
Unicode�������룬Ҳ�����ֺͷ��ŵĶ��չ�ϵ����ͷ0-127���ֺ�ASCII��ȫһ�������Ǵ�128��ʼ�����и����ַ���

48 - '0'
65 - 'A'
97 - 'a'
*/
public class Demo06DataTypeChar {
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1 + 0); // 49

        char zifu2 = 'A'; // ��ʵ�ײ㱣�����65����
        
        char zifu3 = 'C';
        // �����int���ͣ��ұ���char����
        // char --> int,ȷʵ�Ǵ�С���� 
        // �������Զ�����ת��
        int num = zifu3;
        System.out.println(num); // 99

    }
}