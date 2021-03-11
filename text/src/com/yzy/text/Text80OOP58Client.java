package com.yzy.text;
/*
 * 因为是模拟，所以只有换工作区间才好使
 * */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Text80OOP58Client {
public static void main(String[] args) {
	String mess[] = {"你好，我是杨镇宇，请问范晶在不？"};
	Socket mysocket ;
	
	DataOutputStream out = null;
	DataInputStream in = null;
	try {
		System.out.println("杨镇宇打电话找范晶");
		mysocket = new Socket("127.0.0.1",9999);
	
		out = new DataOutputStream(mysocket.getOutputStream());
		in = new DataInputStream(mysocket.getInputStream());
		for (int i = 0; i < mess.length; i++) {
			out.writeUTF(mess[i]);         //向服务器端发送字符串数组
			String s = in.readUTF();      //读取到
			System.out.println("对方说："+s);
			Thread.sleep(500);
		}		
	} catch (Exception e) {
		System.out.println("服务器断开"+e);
	}
}
}
