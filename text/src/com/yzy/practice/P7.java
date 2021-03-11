package com.yzy.practice;
/*
 * 一个static的方法里不可以发起对非static方法的调用
 * 因为非static的方法要与对象联合起来使用，所以调用非static方法时要创建对象，
 * 而static方法调用时不需要创建对象，可以直接调用。也就是说当static方法调用的时候，
 * 对象有可能还没有创建，调用非static方法逻辑不同
 * */

public class P7 {
	public void hello(){
		System.out.println("hello  ");
		this.hello1();	
	}
	public void hello1(){
		System.out.println("world!!!");	
	}
	public static void yzy(){
		System.out.println("yzy");	
	}
	public static void main(String[] args) {
		P7 p = new P7();
		yzy();
		p.hello();	
	}
}
