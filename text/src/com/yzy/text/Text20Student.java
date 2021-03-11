package com.yzy.text;
/*
 * 成员、局部变量练习
 * 
 * */
public class Text20Student {
	String stuName = "10";     //--------成员变量作为参数传递使用（定义在类体当中）
	int stuAge; 
	
	
	int getAge(){                     
		
		return stuAge;
	}
 String stuName(String n) {
	// TODO Auto-generated method stub
	 
             stuName = "0";                         // -------局部变量
             this.stuName = stuName;                //当局部变量和成员变量重名时，成员变量被隐藏
             return stuName;                             
}
 void stuName() {
		// TODO Auto-generated method stub
	             String n ="dfgkwn";
	             stuName = n;                    // =======局部变量只能在方法内使用
	}
 
}
