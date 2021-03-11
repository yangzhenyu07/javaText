package com.yzy.text;
/*
 * 冒泡排序
 * */
public class Text11maopao {
	public static void main(String[] args) {
	int [] array = {1,3,5,7,0,4,6,8,9,2}	;                // 成员变量
	System.out.println("数组排列之前的顺序：");
	//利用for循环来遍历
          for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
          //用冒泡算法来排序
          int temp; //利用第三变量来导值
          for (int i = 0; i < array.length-1; i++) {          // i 为局部变量   外层循环为比较的次数
			for (int j = 0; j < array.length-i-1; j++) {      
				if (array[j]>array[j+1]) {
					temp  = array[j];                   //大的值赋给第三变量
					array[j ] = array[j+1];              //后面的位置的（数）换前面的位置的（数）
					array[j+1] = temp;                //大的值赋给[j+1]的位置					
				}
			}			
		}
          System.out.println();
			System.out.println("数组排列之后的顺序：");
			  for (int k = 0; k< array.length; k++) {
					System.out.println(array[k]); 
	}
	}
	}
