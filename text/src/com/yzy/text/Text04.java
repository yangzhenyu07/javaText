//ˮ�ɻ���
package com.yzy.text;

public class Text04 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		//1000 ���ڵ���
		System.out.println("1000���ڵ�ˮ�ɻ�����");
		for (int i = 100; i < 1000; i++) {
			a =i/100;
			b = i/10 -a*10 ;
			c = i%10;
		if (i == a*a*a+b*b*b+c*c*c) {
			System.out.println("ˮ�ɻ�����"+i);
		}	
	
		
		}
	}

}
