package com.yzy.text;
/*正则表达式     含有一些特殊意义的字符的字符串
 * \d 0-9 ， \D 非数字
 *\s  空白字符    \S 非空白字符
 *\w 单词字符
 *方括号元字符  [abc]          abc中任何一个字符
 *[^abc] 除了abc
 *[a-zA-Z]表明英语里小写字母和大写字母 
 * */
public class Text55OOP33matches {
public static void main(String[] args) {
	String re="\\d{11}";
	String s1 ="15041023915";
	if (s1.matches(re)) {
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
