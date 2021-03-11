package com.yzy.text;
/*练习：
 * 构造、方法一起使用
 * 
 * */
class Student1{
	int stu_Code;
	String stuName;
     int stuDeptCode;
    public Student1() {                                                          //构造无参构造方法
    	
    }
	public Student1(int stu_Code, String stuName, int stuDeptCode) {            //构造没有返回值

		this.stu_Code = stu_Code;
		this.stuName = stuName;
		this.stuDeptCode = stuDeptCode;
	}
	void   setStudentCode(int code){            //设局部变量，为成员变量赋值使用
		      
		        stu_Code = code;
	}
	void   setStuName(String code){
	      
        stuName= code;
}
	void   setstuDeptCode(int dcode){
	      
        stuDeptCode = dcode;
}
	public void print(){                       //创建一个print方法，用来打印学生信息
		System.out.println("学号："+stu_Code);
		System.out.println("姓名："+stuName);
		System.out.println("年级："+stuDeptCode);
		
		
	}
	
}
public class Text25OOP03 {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.stuName = "陈美宏";
		stu.setStudentCode(0001);
		stu.setstuDeptCode(13);
		Student1 stu1 = new Student1(0002,"杨镇宇",13);
		stu.print();
		stu1.print();

	}

}
