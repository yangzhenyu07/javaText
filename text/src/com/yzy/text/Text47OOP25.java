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
				throw new MyException("����������������");
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
			System.out.println("����������п��ܲ��Ϸ�������������."+"ע�⣺�˺�����ĸX����");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("����������ݲ�ȫ��."+"������Ҫ��������һ�������");
		}
		catch(ArithmeticException e)
		{
			System.out.println("���г�������ʱ�ڶ���������Ϊ0");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("ÿ��ֻ������(+,-,*,/)����һ��");
		}
		finally
		{
			System.out.println("ллʹ��");
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

