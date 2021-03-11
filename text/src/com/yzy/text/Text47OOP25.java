package com.yzy.text;

public class Text47OOP25
{
	static private float result;
	static void calculate(float op1,char sign,float op2)throws ArithmeticException,MyException
	{
		switch(sign)
		{
		case '+':
			result=op1+op2;
			break;
		case '-':
			result=op1-op2;
			break;
		case 'x':
			result=op1*op2;
			break;
		case '/':
			if(op2==0)
			{
				throw new ArithmeticException();
				
			}
			result=op1/op2;
			break;
			default:
				throw new MyException("你输入的运算符不对");
		}
	}
	public static void main(String[] args) 
	{
		float in0,in2;
		char in1;
		try
		{
			in0=Float.parseFloat(args[0]);
			in1=args[1].charAt(0);
			in2=Float.parseFloat(args[2]);
			calculate(in0,in1,in2);
			System.out.println(in0+" "+in1+" "+in2+"="+result);
		}
		catch(NumberFormatException e)
		{
			System.out.println("你输入的数有可能不合法，请输入数字."+"注意：乘号用字母X代替");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("你输入的数据不全面."+"程序需要两个数和一个运算符");
		}
		catch(ArithmeticException e)
		{
			System.out.println("进行除法运算时第二个数不能为0");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("每次只能输入(+,-,*,/)其中一个");
		}
		finally
		{
			System.out.println("谢谢使用");
		}
	}
}
class MyException extends Exception
{
	private String message;
	public MyException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}

