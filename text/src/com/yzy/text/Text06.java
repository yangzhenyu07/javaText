package com.yzy.text;
/*
 * 有瑕疵。。。
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text06 {
	public static void main(String[] args) {
		  Scanner sca = new Scanner(System.in);

		
        List	namberList = new ArrayList();
 
           namberList.add(sca.nextInt());
           double sum = 0.0;
 
        	   for (int i = 1; i < namberList.size(); i++) {
            	   double namber = (Double) namberList.get(i);
            	 sum+=namber;
       		
		}
         
           System.out.println("平均数为："+sum/namberList.size());
           
	}
}
