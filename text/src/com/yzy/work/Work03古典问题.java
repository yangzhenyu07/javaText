package com.yzy.work;

import java.util.Scanner;

/*古典问题：有一对兔子，从出生后第3个月起每个人都生一对兔子，小兔子长到第三个
 * 月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子的总数
 * */
public class Work03古典问题 {
	/*
	 * 1月份 ------------ 1对
	 * 2月份-------------1对
	 * 3月份-------------2对
	 * 4月份-------------3对
	 * 5月份-------------5对
	 * 6月份-------------8对
	 * 7月份-------------13对
	 * ....
	 * */
	public static void main(String[] args) {
		
		System.out.println("输入月份:");
		System.out.println("查看---（1-输入的月份）之间每个月兔子的对数：");
		Scanner s = new Scanner(System.in);
		int [] a = new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			if (i==0||i==1) {
				a[i] = 1;
			}else {
				a[i] = a[i-1]+a[i-2];
			}
		}
	for (int i = 0; i< a.length; i++) {
		System.out.println("第"+(i+1)+"个月兔子的对数:");
		System.out.println(a[i]+"对");
	}
		
		
	}

}
