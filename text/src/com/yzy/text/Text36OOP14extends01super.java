package com.yzy.text;
/*
 * ������˽�еı��������಻�ܼ̳У�������̳и����еķ������������Ҫ�õ����ำ˽�б���
 * */
class Father{
	private int x = 2;          //˽�л�
	public int y=1;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;               //this   �ֲ������ͳ�Ա��������ʱ��
	}
}
class Son00 extends Father{
	int y; 
	public int getY() {
		y = super.y;         //�������Ա�����븸���Ա��������ʱ���� super����ʾ�����ø���ĳ�Ա������
		                           //Ҫ��Ȼ����ĳ�Ա�����ᱻ����
		return y;
	}
	public void setY(int k) {	
		y=super.y ;
		y = k;
	}	
}
public class Text36OOP14extends01super {
public static void main(String[] args) {
	Son00 s = new Son00();
           
	System.out.println(	s.getX()       ); //���ø���ķ�����������������˸����˽�л�����
	System.out.println(s.getY());
	
}
}
