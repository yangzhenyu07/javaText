package com.yzy.text;
/*
 * throw
 * 在java 中 如果要在方法中抛出异常可以使用throw
 * */
public class Text45OOP23throw {
static void Proc(int sel)throws ArrayIndexOutOfBoundsException{
	System.out.println("情况"+sel);
	if (sel == 0) {
		System.out.println("没有捕获到异常");
		return;
	}else if(sel == 1){
		int a[] =new int[8];
		a[9] = 3;
	}
}
public static void main(String[] args) {
	try {
		Proc(0);
		Proc(1);
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("捕获到异常"+e);
	}
}
}
