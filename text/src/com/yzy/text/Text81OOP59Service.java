package com.yzy.text;
/*
 * 因为是模拟，所以只有换工作区间才好使
 * */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Text81OOP59Service {
public static void main(String[] args) {
	String answer []={"你好！！！，我就是范晶"};
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
		System.out.println("电话无人使用");
		ONsocket = serverSocket.accept();
		System.out.println("电话铃响了，有人来电");
		out = new DataOutputStream(ONsocket .getOutputStream());
		in = new DataInputStream(ONsocket .getInputStream());
		for (int i = 0; i < answer.length; i++) {
			String s = in.readUTF();
			System.out.println("对方说："+s);
			out.writeUTF(answer[i]);
			Thread.sleep(500);
		}
	} catch (Exception e) {
		System.out.println("对方已挂线！！！");
	}
}
}
