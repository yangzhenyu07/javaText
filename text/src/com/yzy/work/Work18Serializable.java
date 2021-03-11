package com.yzy.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ���ʹ��ObjectInputStream��ObjectOutputStreamʵ�ֶԶ���Ķ�д����
 * ����ʹ�ü̳� Serializable�ӿ�
 * */
class Stu_information implements Serializable{   //����ʹ������ӿ�
	String  name;
	String sex;
	String  ID;
	public Stu_information(String name, String sex, String iD) {

		this.name = name;
		this.sex = sex;
		ID = iD;
	}
	
	public void print(){
		System.out.println("\t������"+"\t�Ա�"+"\tID�ţ�");
		System.out.println("\t"+name+"\t"+sex+"\t"+ID);
	}
}
public class Work18Serializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("D:\\abcd.txt");
		f.createNewFile();
		FileOutputStream  fom = new FileOutputStream("D:\\abcd.txt");	
		ObjectOutputStream oom = new ObjectOutputStream(fom);
		Stu_information  s1 = new Stu_information("������", "��",   "      1001");
		Stu_information  s2 = new Stu_information("����   ", "Ů",  "       1002");
		Stu_information  s3 = new Stu_information("���ƻ�", "��",  "      1003");
		System.out.println("������ǣ�");
		
		s1.print();
		s2.print();
		s3.print();
		oom.writeObject(s1);
		oom.writeObject(s2);
		oom.writeObject(s3);
		oom.close();
		FileInputStream  fim = new FileInputStream("D:\\abcd.txt");	
		ObjectInputStream oim = new ObjectInputStream(fim);
		System.out.println("������ǣ�");
		Stu_information s4 = (Stu_information) oim.readObject();
		Stu_information s5 = (Stu_information) oim.readObject();
		Stu_information s6 = (Stu_information) oim.readObject();
		s4.print();
		s5.print();
		s6.print();
		oim.close();
	}

}
