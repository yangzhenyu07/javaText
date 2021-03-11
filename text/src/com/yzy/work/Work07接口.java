package com.yzy.work;
/*
 * 利用接口和继承机制  对生物  动物  人类 三个接口的定义   其中生物接口定义一个呼吸的抽象方法  ，
 * 动物接口定义一个吃饭睡觉 两个抽象方法 人类接口定义 思维和学习两个抽象方法  定义一个普通人类实现
 *上述三个接口的抽象方法
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
		System.out.println("我会学习！！！");
		
	}

	@Override
	public void think() {
		System.out.println("我会思考");
		
	}

	@Override
	public void eat() {
		System.out.println("我会吃");
		
	}

	@Override
	public void sleep() {
		System.out.println("我会睡觉");
		
	}

	@Override
	public void huxi() {
		System.out.println("我可以呼吸");
		
	}

}
public class Work07接口{
	public static void main(String[] args) {
		System.out.println("我是一名人类！！！");
		Person p = new Person();
		p.eat();
		p.huxi();
		p.sleep();
		p.think();
		p.study();
	}
	
}