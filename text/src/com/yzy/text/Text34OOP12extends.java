package com.yzy.text;
/*
 * 类的访问权限 要不是public 要不是私有
 * 1、继承  也叫派生
 *    定义：extends
 *    父类与子类的关系
 *    子类 is a　父类　　　父类　has a 子类
 *    如果父类中的某些属性被私有 ，子类不能继承 
 * */
class Student8{                           //子类成员变量和父类成员变量重名时，父类成员变量被隐藏
	public int stu_no;
	public String stu_name;
	void setStu_no(int no){                        //给stu_no赋值
		stu_no = no;	
	}
	void setstu_Name(String name){            //给stu_name赋值
		stu_name = name;
	}
	public String toString(){
		String s;
		s = "学号:"+stu_no+","+"研究生姓名："+stu_name;
		return s;
	}	
}
class Son extends Student8{
	public String tutor;           //tutor  导师
	public String sprc_direction;  //sprc_direction 研究方向
	void  setTutor(String tu_tor){
		tutor = tu_tor;
	}
	void setSprc_direction(String direction){
		sprc_direction = direction;
	}	
}
public class Text34OOP12extends extends Student8 {
	public static void main(String[] args) {
		Son s = new Son();
		s.setstu_Name("范晶");            //赋值
		s.setStu_no(10011);
		s.setTutor("杨镇宇");
		s.setSprc_direction("计算机");
		System.out.println(s.toString());
		System.out.println(",研究方向："+s.sprc_direction+",导师："+s.tutor);
	}
}
