package com.yzy.text;
/*
 * ��Ϊ��ģ�⣬����ֻ�л���������ź�ʹ
 * */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Text81OOP59Service {
public static void main(String[] args) {
	String answer []={"��ã��������Ҿ��Ƿ���"};
	ServerSocket serverSocket = null;
	Socket ONsocket = null;
	DataInputStream in  = null;
	DataOutputStream out= null;
	try {
		serverSocket =new ServerSocket(9999);
	} catch (Exception e) {
      System.out.println(e);
	}
	
		
	
	try {
		System.out.println("�绰����ʹ��");
		ONsocket = serverSocket.accept();
		System.out.println("�绰�����ˣ���������");
		out = new DataOutputStream(ONsocket .getOutputStream());
		in = new DataInputStream(ONsocket .getInputStream());
		for (int i = 0; i < answer.length; i++) {
			String s = in.readUTF();
			System.out.println("�Է�˵��"+s);
			out.writeUTF(answer[i]);
			Thread.sleep(500);
		}
	} catch (Exception e) {
		System.out.println("�Է��ѹ��ߣ�����");
	}
}
}
