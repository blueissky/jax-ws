package org.sunny.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class SayHello {

	public String say(String name){
		System.out.println("Hello " + name + " , this is SayHelloService !");
        return "Hello " + name + " , this is SayHelloService !" ;
    }
 
    public static void main(String[] args) {
        //��һ�������Ƿ���ʱ��url��9091������һ����ռ�õĶ˿�
        Endpoint.publish("http://192.168.20.157:9091/Service/SayHello", new SayHello());
        System.out.println("service success !");
    }


}
