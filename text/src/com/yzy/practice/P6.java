package com.yzy.practice;
/*
 * 跳出循环：利用让外层循环条件表达式的结果受里层循环体的代码控制
 * */
public class P6 {
public static void main(String[] args) {
	int arr[][] = {{1,2,3},{4,5,6,7},{9}};
	  boolean found = false;
	  for(int i=0;i<arr.length && !found;i++) {
	    for(int j=0;j<arr[i].length;j++){
	      System.out.println("i=" + i + ",j=" + j);
	      if(arr[i][j] == 5) {
	        found = true;
	        break;
	      }
	   }
	  }

}
}
