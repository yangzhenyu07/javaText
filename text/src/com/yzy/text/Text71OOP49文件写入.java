package com.yzy.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.ArrayList;

class User implements Serializable{  //Serializable    Ҫ�� ArrayList��ӵ��������������������ʽд
	String name;
	String id;
	String password;
	public User(String name, String id, String password) {
		
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
}
public class Text71OOP49�ļ�д�� {
public static void main(String[] args)  throws IOException,ClassNotFoundException,OptionalDataException{
	  ArrayList a = new ArrayList();                    //����ش�
	  a.add(new User("������","xiaoqiang","1995217"));
	  a.add(new User("������","xiaoqiang","1995217"));
	  a.add(new User("����   ","xiaoqiang","1995217"));
	  a.add(new User("������","xiaoqiang","1995217"));
	  ObjectOutputStream objs = new ObjectOutputStream(new FileOutputStream("F:\\Test\\ac.txt"));
	  objs.writeObject(a);
	  objs.close();
	  ObjectInputStream objs1 = new ObjectInputStream(new FileInputStream("F:\\Test\\ac.txt"));
	  ArrayList  b = (ArrayList) objs1.readObject();
	  objs1.close();
	  User user = (User)b.get(0);  //����ǿת�ɶ���
	  User user1 = (User)b.get(1);
	  User user2 = (User)b.get(2);
	  User user3 = (User)b.get(3);
	  System.out.println("\t������"+"\tID:"+"\t���룺");
	  System.out.println("\t"+user.name+"\t"+user.id+"\t"+user.password);
	  System.out.println("\t"+user1.name+"\t"+user1.id+"\t"+user1.password);
	  System.out.println("\t"+user2.name+"\t"+user2.id+"\t"+user2.password);
	  System.out.println("\t"+user3.name+"\t"+user3.id+"\t"+user3.password);
}
}
