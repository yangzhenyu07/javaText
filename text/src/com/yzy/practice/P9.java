package com.yzy.practice;

public class P9 {

	/**
	 * 计算机 -->二进制
	 * */
	public static void main(String[] args) {
		//二进制的最高位用来判断数值的正负，例如:最高位为1，代表负数，0为正数
		//在计算机中 int 类型 占比32位[bit]
		//int类型 -9相当于计算机二进制中的正码: 1000 0000 0000 0000 0000 0000 0000 1001
		//反码：1111 1111 1111 1111 1111 1111 1111 0110
		//补码: 1111 1111 1111 1111 1111 1111 1111 0111 (计算机数据一律用补码存储)
		
		//左位移操作: <<3
		//补码:1111 1111 1111 1111 1111 1111 1111 0111
		//<<3 原理 :高位移除3位(bit) ，低位补0，结果为
		//1111 1111 1111 1111 1111 1111 1011 1000
		//翻译为十进制
		//因为 首位为1 所以为负数
		//补码 转成 反码 转成 原码 :-1-》 取反
		//(1) 补码->反码(-1):  1111 1111 1111 1111 1111 1111 1011 0111
		//(2) 反码->原码:   0000 0000 0000 0000  0000 0000 0100 1000
		//(3) 二进制转成十进制为 72
		double str = Math.pow(2, 0)*0+Math.pow(2, 1)*0+Math.pow(2, 2)*0+Math.pow(2, 3)*1
		+Math.pow(2, 4)*0+Math.pow(2, 5)*0+Math.pow(2, 6)*1;
		//System.out.printf("<<3原码 :二进制转成十进制:%f\n",str);
		//(4)所以最后的答案为-72
		//System.out.printf("左位移最后结果:%d\n",-9<< 3);
        //右位移操作: >>3
		//-9的补码为1111 1111 1111 1111 1111 1111 1111 0111
		//>>3 原理 :因为被操作数为负数，所以低位移除3位(bit) ，高位补1，结果为
		//1111 1111 1111 1111 1111 1111 1111 1110
		//翻译为十进制
		//因为 首位为1 所以为负数
		//补码 转成 反码 转成 原码 :-1-》 取反
		//(1) 补码->反码(-1):  1111 1111 1111 1111 1111 1111 1111 1101
		//(2) 反码->原码:   0000 0000 0000 0000  0000 0000 0000 0010
		//(3) 二进制转成十进制为 2
		double str1 = Math.pow(2, 0)*0+Math.pow(2, 1)*1;
		//System.out.printf(">>3原码 :二进制转成十进制:%f\n",str1);
		//(4)所以最后的答案为-2
		System.out.printf("右位移最后结果:%d\n",-9>> 3);
	}
}
