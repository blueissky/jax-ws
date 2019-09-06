package src;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Test {
	public static void main(String[] args) {
		// 方法一
        try {
            // 服务WSDL Document的地址
            URL url = new URL("http://192.168.20.157:9091/Service/SayHello?wsdl");
            // 1. QName，QName是 qualified name 的简写。
            // 2. QName由名字空间（namespace）前缀（prefix）以及冒号“:”，还有一个元素名称构成。
            // 由package-info.java文件可知namespace为http://service.sunny.org/，
            QName qname = new QName("http://service.sunny.org/", "SayHelloService");
            Service service = Service.create(url, qname);
            SayHello sayHello = service.getPort(SayHello.class);
            String result = sayHello.say("Sunny0122");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
 /**
        // 方法二
         //通过SayHelloService的getSayHelloPort()方法的SayHello接口
         SayHello sayHello = new SayHelloService().getSayHelloPort();
         //调用SayHello接口的say方法
         String result = sayHello.say("Sunny02");
         //输出返回内容
         System.out.println(result);
**/         
	}
}
