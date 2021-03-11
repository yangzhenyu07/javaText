package com.yzy.text;
/*
 * �����뼯�Ͽ��
 * ����   �����������Ͱ�ȫ�ļ��Ͽ��
 * ���� ɢ�У� ɢ��ӳ�䣬 ��ϣ   jdk1.5֮���֧��
 * ��ζ���һ��������
 * class ����<�����б�(E,K,A,T,F)>
 * A:
 * E:  �κ�����
 * T:  ָ������
 * class Cone<E>{
 *              double height;
 *              E bottom;        //E�൱����������
 *              public Cone(E b)  //E�൱����������
 *              bottom = b;
 * }
 * ʹ�÷�������������
 * Cone<Cricle> coneone;
 * coneone = new Cone<Circle>(new Circle());
 * */
/**
 * ׶��
 * */
class Cone<E>{                    
	double height;
	E bottom;                           //��
	public Cone(E bottom) {
		this.bottom = bottom;
	}
	public double computeVolume(){
		String  s = bottom.toString(); 
		double ss =Double.parseDouble(s);
		return 1.0/3.0*ss*height;
	}
}
/**
 * Բ׶�����
 * */
class CircleA{
	double  radius, area;

	public CircleA(double r) {
		
		radius = r;
	}
	public String toString(){                           
		
		area=radius*radius*Math.PI;    //Math.PI           �е���˼
		return  ""+area;           //double��ת����String��
	}
}
/**
 * �Ľ�׶ �����
 * */
class Rectangle{
	double sidA,sidB,area;

	public Rectangle(double sidA, double sidB) {

		this.sidA = sidA;
		this.sidB = sidB;
	}
	public String toString(){                       
		
		area =sidA*sidB;
		return ""+area;
	}
	
}
public class Text56OOP34������ {
	public static void main(String[] args) {
		CircleA circle = new CircleA(10);
		Cone<CircleA> coneone = new Cone<CircleA>(circle);
		coneone.height = 30;
		System.out.println("Բ׶�����"+coneone.computeVolume());
		Rectangle rectangle = new Rectangle(10, 20);
		Cone<Rectangle>  conetwo = new Cone<Rectangle>(rectangle);
		conetwo.height = 40;
		System.out.println("�Ľ�׶�����"+conetwo.computeVolume());
	}

}
