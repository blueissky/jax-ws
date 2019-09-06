package src;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Test {
	public static void main(String[] args) {
		// ����һ
        try {
            // ����WSDL Document�ĵ�ַ
            URL url = new URL("http://192.168.20.157:9091/Service/SayHello?wsdl");
            // 1. QName��QName�� qualified name �ļ�д��
            // 2. QName�����ֿռ䣨namespace��ǰ׺��prefix���Լ�ð�š�:��������һ��Ԫ�����ƹ��ɡ�
            // ��package-info.java�ļ���֪namespaceΪhttp://service.sunny.org/��
            QName qname = new QName("http://service.sunny.org/", "SayHelloService");
            Service service = Service.create(url, qname);
            SayHello sayHello = service.getPort(SayHello.class);
            String result = sayHello.say("Sunny0122");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
 /**
        // ������
         //ͨ��SayHelloService��getSayHelloPort()������SayHello�ӿ�
         SayHello sayHello = new SayHelloService().getSayHelloPort();
         //����SayHello�ӿڵ�say����
         String result = sayHello.say("Sunny02");
         //�����������
         System.out.println(result);
**/         
	}
}
