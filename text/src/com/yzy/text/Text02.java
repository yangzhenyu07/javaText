
//����
package com.yzy.text;

public class Text02 {
	public static void main(String[] args) {
		System.out.println("1000���ڵ�����");
		for (int i = 1; i < 1000; i++) {
			int y = 0 ; //Լ��
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					y+=j;
			
					if (y==i) {
						System.out.println(i);
					}
				
					
				}
				
			}
			
		}
	}

}
