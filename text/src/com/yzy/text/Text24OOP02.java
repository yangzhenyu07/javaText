package com.yzy.text;

public class Text24OOP02 {
	public static void main(String[] args) {
		Text24OOP02 r = new Text24OOP02(130320129,"杨镇宇",12);
		System.out.println("学号："+r.stu_Code+",姓名："+r.stuName+",年级："+r.stuDeptCode);
		
	}
	
	int stu_Code;
	String stuName;
     int stuDeptCode;
    public Text24OOP02() {
    	stu_Code =10011;
    	 stuName = "";
         stuDeptCode = 11;
	}
	public Text24OOP02(int stu_Code, String stuName, int stuDeptCode) { //习惯成员变量赋值在构造方法中
		                                                                                                         //构造方法习惯写在主方法中
	
		this.stu_Code = stu_Code;
		this.stuName = stuName;
		this.stuDeptCode = stuDeptCode;
	}
    
}

	
	
