package com.yzy.text;

import java.util.Stack;

/*异常
 * 错误：                                               异常：
 * 1、编译错误                                    *    java 的编译器必须捕获和声明所有非运行时的异常 ，                                             
 * （1）大小错误                                 *    但对运行时异常可以不做处理
 * （2）未定义的变量                           *    常见的系统异常
 * （3）使用未初始化的变量                 *     ClassNotFoundException      未找到欲装载使用的类异常
 * （4）数据类型与变量类型不匹配        *    ArrayIndexOfBoundsException     数组下标越界
 * （5）语句后面遗漏分号                    *     FileNotFoundException          文件未找到异常  IO
 * （6）括号不匹配                              *     IOException                          输入输出异常
 * 2、运行错误                                    *     NullPointerException             空指针异常
 *   下标越界                                       *     InterruptedException             打断异常  线程
 *   ..........                                            *     UnknowHostException          无法确定的主机地址
 *   ---------------                               *     ArithmeticException              算数异常除数为0
 *                                                          try{
 *                                                                   java  语句块
 *                                                          }catch（异常类型 变量（对象））{
 *                                                                       异常处理的语句块
 *                                                          }finally{
 *                                                                     Java语句块
 *                                                          }
 * */
public class Text44OOP22异常
{
	
		static void Proc(int sel){                                     //类方法
			System.out.println("情况："+sel);
			try {
				if(sel ==0){
					System.out.println("没有捕捉到异常");
					return;
				}else if(sel == 1){
					int i = 0;
					int j =4/i;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("捕获"+e);
			}catch(Exception e){
				System.out.println("捕获"+e);
			}finally{
				System.out.println("程序执行完毕");
			}
		}
public static void main(String[] args) {
	int a[] = {1,2,3};
	for (int i = 0; i <3; i++) {
		System.out.println(a[i]);   //当i<=3时输出   java.lang.ArrayIndexOutOfBoundsException: 3
		}
	    Proc(0);
	    Proc(1);
}
}	


