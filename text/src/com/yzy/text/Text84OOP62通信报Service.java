package com.yzy.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Text84OOP62通信报Service {
public static void main(String[] args) {
	try {
		DatagramSocket Dsocket = new DatagramSocket(9999);
		byte [] buffer = new byte [1024];
		DatagramPacket packet = new DatagramPacket (buffer,buffer.length); 
		Dsocket.receive(packet);
		System.out.println("服务器端收到了数据报");
		Dsocket.send(packet);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.toString());
		
	}
}

}
