package com.yzy.work;

import java.util.Scanner;

/*1������
 * ��ʵ������ʵ���ڼ�����߼��е�ӳ������� ������ͬʱ������ľ���ʵ��
 * 2��ʲô���� �������Щ��Ա
 * ������ͬ���������Ի���Ϊ�Ķ���ĳ��󣬾��г��󻯶����ģ��    ���������������
 * 3�����������ص�
 * ��װ �̳� ��̬ ����
 * 4���������ʵ������������
 * ����������ж����У�����һ����������ֵ�ı䣬��������õ��ľ��Ǹı��Ľ������ʵ�����������ڶ���˽�У�����һ��
 * �������ı䣬��Ӱ����������
 * 5�����һ��Box��  length width height ��������  ���������з���
 * ��1����volume������������Box��������
 * ��2��������һ��area������������Box�ı����
 * 6�����һ�������� ʵ�ּӼ��˳�
 * 
 * 
 * */
class Box{
	double length;
	double width;
	double height;
	double volume;
	double area;
	static{
		 System.out.println("��ӭ���룡����");
		 System.out.println("��ѡ����Ҫ��ģ�");
		System.out.println("����-1�����");
		System.out.println("����-2�����");
	}
	void shuru(){
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		 length = s.nextDouble();
		 width = s1.nextDouble();
		 height = s2.nextDouble();
		
	}
	
	double volume(){
		volume = length*width*height;
		return volume;
	}
	double area(){
		area= 2*(length*width+width*height+length*height);
		return area;
	}
}
public class Work00Box�� {
	public static void main(String[] args) {
		Box box =new Box();
		
		Scanner s = new Scanner(System.in);
		int ss = s.nextInt();
		
		switch (ss) {
		case -1:
			System.out.println("�����볤���");
			box.shuru();                  //������߸�ֵ
			System.out.println(box.volume());
			break;
         case -2:
        		System.out.println("�����볤���");
        	 box.shuru();
			System.out.println(box.area());
			break;

		default:
			System.out.println("������-1��-2");
			break;
		}
		
	}

}
