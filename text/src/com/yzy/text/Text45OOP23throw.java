package com.yzy.text;
/*
 * throw
 * ��java �� ���Ҫ�ڷ������׳��쳣����ʹ��throw
 * */
public class Text45OOP23throw {
static void Proc(int sel)throws ArrayIndexOutOfBoundsException{
	System.out.println("���"+sel);
	if (sel == 0) {
		System.out.println("û�в����쳣");
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
		System.out.println("�����쳣"+e);
	}
}
}
