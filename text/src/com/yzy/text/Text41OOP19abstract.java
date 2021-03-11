package com.yzy.text;
/*
 * ������
 * abstract
 * ����һ���Ҳ�ǳ��󷽷���ֻ�з�����û�з����壩
 * java��̬���� ˽�з��� ���췽�����ܶ���Ϊ���󷽷�
 * �����಻��ʵ���� ֻ�ܴ�������
 * 
 * 
 * */
abstract class Shape{                //��ͼ
	public String lineColor;
	public String fillColor;
	public void setLineColor(String Color){
		lineColor = Color;
		
	}
	public void setFillColor(String Color){
		fillColor = Color;
		
	}
	abstract void draw();
}

class Rect extends Shape{          //����
        float width,height;

        public Rect(float width, float height) {        //�൱�ڷ�����дһ��

	        this.width = width;
	        this.height = height;
       }
        public void draw() {                  //�̳г�����ʱ���ĸ���Ҫ����abstract��Ҫ����д��д����ķ���
	        System.out.println("���Σ��߿���ɫ"+lineColor+"�����ɫ��"+fillColor);
	        System.out.println("���="+width+"�߶� = "+height);
	
       }
}
 class Circle extends Shape{          //  Բ��
	 double radius;

	public Circle(double radius) {               //�൱�ڷ�����дһ�� 
		super();
		this.radius = radius;
	}
	 public void draw(){
		 System.out.println("���Σ��߿���ɫ"+lineColor+"�����ɫ��"+fillColor);
		 System.out.println("�뾶Ϊ"+radius);
	 }
	 
 }
public class Text41OOP19abstract {
public static void main(String[] args) {
	Shape rect = new  Rect(20,10);                               //��ת�Ͷ���
   rect.setLineColor("��ɫ");
	
	rect.setFillColor("��ɫ");
	rect.draw();
	Shape rect1 = new Circle(5);                                   //��ת�Ͷ���
	rect1.setFillColor("��ɫ");
	rect1.setLineColor("��ɫ");
	rect1.draw();
			
}
}
