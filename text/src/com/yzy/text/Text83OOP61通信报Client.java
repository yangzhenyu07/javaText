package com.yzy.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Text83OOP61ͨ�ű�Client {
     public static void main(String[] args) {
		try {
			DatagramSocket  Dsocket = new DatagramSocket();    //����֮�佨��һ�����ݱ���ͨ��
			byte [] buffer = new byte [1024];   //��������Ϊ1024�ֽڵĻ�����һ��
			System.out.println("���뷢�͵���Ϣ");
			System.in.read(buffer);
			DatagramPacket  packet = new DatagramPacket(buffer, buffer.length,InetAddress.getByName("127.0.0.1"),9999);    //����һ�����ݱ�
			 Dsocket.send(packet);
			 System.out.println("���ݱ��������");
			 Dsocket.receive(packet);//�������ݱ�
			 System.out.println("�ͻ��˽��ܷ��ص����ݱ�");
		} catch (Exception e) {
			
		System.out.println(e.toString());
		}
	}
}
