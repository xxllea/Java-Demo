/* 
�κ��������Ͷ�����Ϊһ���������ݡ�
��һ��������Ϊ���������ݵ�������ʱ��ʵ���ϴ��ݽ�ȥ���Ƕ���ĵ�ֵַ
   
*/
public class Demo64PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "ƻ��";
        one.price = 8388.0;
        one.color = "blue";
        method(one); // ���ݽ�ȥ�Ĳ�����ʵ���ǵ�ֵַ  
    }

    public static void method(Phone param) {
        System.out.println(param.brand); // ƻ��
        System.out.println(param.price); // 8388.0
        System.out.println(param.color); // blue
    }
}

