package com.yzy.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Text83OOP61通信报Client {
     public static void main(String[] args) {
		try {
			DatagramSocket  Dsocket = new DatagramSocket();    //程序之间建立一个数据报的通信
			byte [] buffer = new byte [1024];   //创建长度为1024字节的缓冲器一个
			System.out.println("输入发送的信息");
			System.in.read(buffer);
			DatagramPacket  packet = new DatagramPacket(buffer, buffer.length,InetAddress.getByName("127.0.0.1"),9999);    //建立一个数据报
			 Dsocket.send(packet);
			 System.out.println("数据报发送完毕");
			 Dsocket.receive(packet);//接受数据报
			 System.out.println("客户端接受返回的数据报");
		} catch (Exception e) {
			
		System.out.println(e.toString());
		}
	}
}
