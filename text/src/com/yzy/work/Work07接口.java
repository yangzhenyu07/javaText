package com.yzy.work;
/*
 * ���ýӿںͼ̳л���  ������  ����  ���� �����ӿڵĶ���   ��������ӿڶ���һ�������ĳ��󷽷�  ��
 * ����ӿڶ���һ���Է�˯�� �������󷽷� ����ӿڶ��� ˼ά��ѧϰ�������󷽷�  ����һ����ͨ����ʵ��
 *���������ӿڵĳ��󷽷�
 * */
interface shengwu{
	abstract void huxi();
}
interface dongwu{
	 abstract  void eat();
	 abstract void sleep();
}
interface renlei{
	abstract  void  study();
	abstract void think();
}
 class Person implements shengwu,dongwu,renlei{

	@Override
	public void study() {
		System.out.println("�һ�ѧϰ������");
		
	}

	@Override
	public void think() {
		System.out.println("�һ�˼��");
		
	}

	@Override
	public void eat() {
		System.out.println("�һ��");
		
	}

	@Override
	public void sleep() {
		System.out.println("�һ�˯��");
		
	}

	@Override
	public void huxi() {
		System.out.println("�ҿ��Ժ���");
		
	}

}
public class Work07�ӿ�{
	public static void main(String[] args) {
		System.out.println("����һ�����࣡����");
		Person p = new Person();
		p.eat();
		p.huxi();
		p.sleep();
		p.think();
		p.study();
	}
	
}