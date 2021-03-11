package com.yzy.text;
/*
 * this不能出现在类方法中，this表示实例（因为类方法直接能够通过类名调用）
 * applet 小程序工具类库      不能有主方法，在Eclipse里不能执行
 * -----------------------------------------------------------------------------------------------------
 * 1、java.lang      是Java语音的核心类库 基本的数据类型，线程。。。。（会被自动加载）
 * 2、java.util        包含工具类  vector 向量类  日期类 时间类 堆栈类 键盘输入
 * 3、java.io          输入输出包 提供了计算机中存储的文件进行的操作   File类（创建文件.exe）
 * 4、java.net        实现网络工程
 * 5、java.sql         对数据库的操作
 * 6、java.math     引入数学类   Math
 * 
 * */
class TextB{
	int x;
	void function(){
		this.x = 100;   //直接调用上面的成员变量
		
 	}
	 int function01(){
         this.function();		  //调用上面的方法
		return x;
	}
	
}
public class Text32OOP10applet {
	public static void main(String[] args) {
		TextB y= new TextB();
		System.out.println(y.function01());
	}

}