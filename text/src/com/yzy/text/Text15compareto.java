package com.yzy.text;
/*compareto（String s）用法
 * */
public class Text15compareto {
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(str.compareTo("ac"));//看字典中的排序————相互 比较
		System.out.println(str.compareTo("ad"));
	
		//	compareToIgnoreCase("") 忽略大小写
	   /*输出：
	    *         -1
	    *         -2
	    * */
		
	}

}
