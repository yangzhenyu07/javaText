package com.yzy.practice;
/*
 * ����ѭ�������������ѭ���������ʽ�Ľ�������ѭ����Ĵ������
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
