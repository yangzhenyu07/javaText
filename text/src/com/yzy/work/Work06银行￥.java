package com.yzy.work;

import java.util.Scanner;

/*1、子类能不能重载父类的方法 ， 改写父类方法满足的条件
 *     子类不能重载父类       ，先重写父类的方法后，重载该方法
 * 2、接口和抽象类的不同
 *      接口可以多继承 ， 而抽象类不行
 * 3、在构造方法中可以同时使用this和super关键字吗
 *        不能，因为在父类中不能使用super 关键字
 * 4、在接口能不能声明变量  在接口中能不能定义非抽象方法
 *      不能（接口只有常量和方法，没有变量和方法的实现，只能定义static final类型的变量 他们就是常量），
 *      不能（接口中都是抽象方法，在接口中默认为抽象方法，抽象类既可以抽象方法也可以非抽象方法）
 * 5、内部类的外包类的成员变量在内部类中是否有效
 *       有效
 * 6、创建一个Account类   模拟银行账号  账号 余额 利率 存款 取款
 *      两个子类  借记卡 信用卡（ 透支限制）
 * 7、利用接口和继承机制  对生物  动物  人类 三个接口的定义   其中生物接口定义一个呼吸的抽象方法  ，
 *      动物接口定义一个吃饭睡觉 两个抽象方法 人类接口定义 思维和学习两个抽象方法  定义一个普通人类实现
 *      上述三个接口的抽象方法
 * 
 * */
interface Overdraft              //透支限制
{                     
	void show();
}
abstract class Account
{  
	String ID;
	double rate;
	//double balance;
	abstract void bankAccountNumber();
	abstract double  getMoney(double a );              //取款
	abstract double setMoney(double a);               //存款
	abstract double yue();
}
class Debit  extends Account               //借记卡
{
	double balance=10000;
	
	void bankAccountNumber() 
	{
	      ID ="45387874385793384";
		   rate = 0.54;
	    System.out.println("借记卡账号："+ID);
	    System.out.println("借记卡利率："+rate);
	    System.out.println("余额："+balance);
	}
	double getMoney(double a)     //借记卡取款
	{
		if (a<=10000) {
			balance = balance -a;
			System.out.println("操作已取出！：借记卡余额:"+balance);
			
		}else{
			System.out.println("抱歉！！：借记卡余额不足！！！");
		}
		return balance;		
	}
	double setMoney(double a) {             //借记卡存款		
		  balance = balance +a;
			return balance;
	}
    public double yue(){
		double sum =balance;
		System.out.println("操作已成功！！！");
		System.out.println("现余额："+sum);
	  return sum;
	}
}
class DC  extends Account   implements Overdraft               //信用卡
{
	double balance = 5000000;
	void bankAccountNumber()
	{
		 ID ="584946413bdfdf58";
		 rate = 0.74;
		 System.out.println("信用卡账号："+ID);
	    System.out.println("信用卡利率："+rate);
	}
	double getMoney(double a)                   //信用卡取款
	{
		balance = 5000000 - a;
		
			return balance;
	}
          public  double yue()
          {
        	 double sum =balance;
      		System.out.println("操作已成功！！！");
      		System.out.println("现余额："+sum);
      	    return sum;
           }
	double setMoney(double a) {                    //信用卡存款数
		balance = 5000000;
			return balance;
	}

	public void show() {                                          //  透支限制
		System.out.println("是否查看此卡的透支限度！");
		System.out.println("是 ：输入-1          否： 其他数字");
		Scanner s =new Scanner(System.in);
		if (s.nextInt() == -1) {
			System.out.println("信用卡透支数：5000000")  ; 
			System.out.println("是否取款：");
			System.out.println("是(Yes)：输入-1              否(No):输入-2");
			Scanner sw  = new Scanner(System.in);
	          switch (sw.nextInt()) {
			case -1:
				System.out.println("请输入取款金额：");
				Scanner sca = new Scanner(System.in);
				double sss = sca.nextDouble();
				getMoney(sss);
				yue();
				break;
		     case -2:
		    	System.out.println("系统已关闭");		
				break;
			default:
				System.out.println("请输入正确数字！！！");
				break;
			}
		}else {
			System.out.println("是否取款！");
			System.out.println("是 ：输入-1          否： 其他数字");
			Scanner sz =new Scanner(System.in);
	        if (sz.nextInt()==-1) {
	        	System.out.println("输入取款金额：");
	        	Scanner sq =new Scanner(System.in);
				getMoney(sq.nextInt());
				yue();
			}else{
				System.out.println("系统已关闭！！！");
			}			
		}          	
	}	
}
public class Work06银行￥ 
{
	static
	{   
	System.out.println("欢迎进入银行查询！！！");
	System.out.println("");
	}
public static void main(String[] args)
{
        DC   dc = new DC();                          //信用卡
        Debit  debit = new Debit();               //借记卡
        System.out.println("请选择借记卡/信用卡：");
    	System.out.println("选择借记卡：输入-1");
    	System.out.println("选择信用卡：输入-2");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		
			if (g==-1) 
			{
				System.out.println("欢迎进入借记卡操作页面：");
				System.out.println("");
				debit.bankAccountNumber();
				System.out.println("是否存取款：");
				System.out.println("存款：输入-1                    取款:输入-2");
				Scanner s  = new Scanner(System.in);
	          switch (s.nextInt()) {
			case -1:
				System.out.println("请输入存款金额：");
				Scanner sca = new Scanner(System.in);
				double sss = sca.nextDouble();
				debit.setMoney(sss);
				debit.yue();
				break;
		     case -2:
		    	 System.out.println("请输入取款金额：");
				Scanner sa = new Scanner(System.in);
				double ss = sa.nextDouble();
				debit.getMoney(ss);		
				break;
			default:
				System.out.println("请输入正确数字！！！");
				break ;
			}	
			}else if(g == -2)
			{
				System.out.println("欢迎进入信用卡操作页面：");
				System.out.println("");
				dc.bankAccountNumber();
				dc.show();		
			
			}else{
				System.out.println("请输入正确数字！！！");
			}
}
}
