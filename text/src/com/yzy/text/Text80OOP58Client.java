package com.yzy.text;
/*
 * ��Ϊ��ģ�⣬����ֻ�л���������ź�ʹ
 * */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Text80OOP58Client {
public static void main(String[] args) {
	String mess[] = {"��ã�������������ʷ����ڲ���"};
	Socket mysocket ;
	
	DataOutputStream out = null;
	DataInputStream in = null;
	try {
		System.out.println("�������绰�ҷ���");
		mysocket = new Socket("127.0.0.1",9999);
	
		out = new DataOutputStream(mysocket.getOutputStream());
		in = new DataInputStream(mysocket.getInputStream());
		for (int i = 0; i < mess.length; i++) {
			out.writeUTF(mess[i]);         //��������˷����ַ�������
			String s = in.readUTF();      //��ȡ��
			System.out.println("�Է�˵��"+s);
			Thread.sleep(500);
		}		
	} catch (Exception e) {
		System.out.println("�������Ͽ�"+e);
	}
}
}
