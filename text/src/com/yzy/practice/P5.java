package com.yzy.practice;

import java.math.BigDecimal;

public class P5 {

	public static void main(String[] args) {
		BigDecimal bignum1 = new BigDecimal("10"); 
		BigDecimal bignum2 = new BigDecimal("3"); 
		BigDecimal bignum3 = null; 
		//四舍五入，保留小数点后两位
		bignum3 = bignum1.divide(bignum2,2,BigDecimal.ROUND_HALF_UP); 
		System.out.println(bignum3.toString());
		
		
	}
}
