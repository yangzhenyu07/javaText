package com.yzy.text;
/*
 * ���ͽӿ�
 * ���÷����������ӿ�������
 * */
interface Computer<E,F>{  //������������
	void makechorue(E x,F y);
}
class Chorus<E,F>implements Computer <E,F>{


	public void makechorue(E x, F y) {
		x.toString();  //��Ϊ��֪��ʲô���ͣ�����ͳһ����ַ���
		y.toString();
		
	}
	
}
class Musical{
	public String toString(){
		System.out.println("| 5 6 3-| 5  17  56|");
		return "";                                  //����String��
	}
}
class Singer{
	public String toString(){
		System.out.println("��һ������");
		return "";
	}
}
public class Text57OOP35���ͽӿ� {
public static void main(String[] args) {
	Chorus<Singer, Musical> model = new Chorus<Singer,Musical>();
	Singer singer = new Singer();
	Musical musical= new Musical();
	model.makechorue(singer, musical);
}
}
