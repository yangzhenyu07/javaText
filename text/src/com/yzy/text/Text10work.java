package com.yzy.text;

/*作业：
 *  1、Java的平台有几部分组成，各有什么作用？
 *     javase 、javaee 、javawe
 *       
 * 2、运行一个java程序的步骤？
 *      源文件由虚拟机编译成字节码后，在虚拟机上解释运行。
 * 3、写出你的名字，打印出你的名字
 *      System.out.println("写出你的姓名");
	     Scanner sc = new Scanner(System.in);
	     String ss =  sc.next();
	     System.out.println("打印小票：");
	     System.out.println("姓名"+ss);
 * 4、什么是标识符，标识符的命名规则？
 *      java中包、类、方法、参数、和变量的名字
 *      由任意英文字母、数字、下划线、美元符组成(不能以数字开头、不能用关键字来表示标识符)
 * 5、Java的数据类型分几类，基本的数据类型有哪些？
 *      两类 基本数据类型、引用数据类型
 *      基本数据类型： byte、short、int、long、float、double、boolean、char
 * 6、从键盘上进行输入两个双精度的浮点型，求它们的加减乘除？ 
 * */
import java.lang.Thread.State;
import java.util.Scanner;


public class Text10work {
static {

		System.out.println("请添加算法");
	}
      
	
public static void main(String[] args) {
	
	Text10work t = new Text10work();
	

	System.out.println("加法：输入-1");
	System.out.println("乘法：输入-2");
	System.out.println("减法：输入-3");
	System.out.println("除法：输入-4");
	Scanner sc = new Scanner(System.in);
	int ss = sc.nextInt();
	switch (ss) {
    	case -1:
    		System.out.println("请输入两个数");
    		System.out.println(t.jiafa());
		
		    break;
       case -2:
    	    System.out.println("请输入两个数");
   		    System.out.println(t.chengfa());
		
		    break;
       case -3:
    	   System.out.println("请输入两个数");
   		   System.out.println(t.jianfa());
	
	         break;
       case -4:
    	   System.out.println("请输入两个数");
   		   System.out.println(t.chufa());	
	
	         break;

	default:
		    System.out.println("请输入-1、-2、-3、-4");
		     
	}
	
}
Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);


double  jiafa(){
	
	double  a = sc.nextDouble();
	double b=sc1.nextDouble();
	double c = a+b;

	return c;
}
double jianfa(){
	double  a = sc.nextDouble();
	double b=sc1.nextDouble();
	double c = a-b;
	
	return c;
}
double chengfa(){
	double  a = sc.nextDouble();
	double b=sc1.nextDouble();
	double c = a*b;
	
	return c;
}
double chufa(){
	double  a = sc.nextDouble();
	double b=sc1.nextDouble();
	double c = a/b;
	
	return c;
}
}
