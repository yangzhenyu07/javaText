package com.yzy.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class P12 {

	public String zlData(String msg) {
		 BigDecimal   value = new BigDecimal(String.valueOf(msg));
         DecimalFormat df= null;
        df  = new DecimalFormat("#0.00");
		return df.format(value.doubleValue());
	}
	public static void main(String[] args) {
		String o = "100.1";		
        System.out.println(new P12().zlData(o));
	}
}
