package com.yzy.text;

/*��ҵ��
 *  1��Java��ƽ̨�м�������ɣ�����ʲô���ã�
 *     javase ��javaee ��javawe
 *       
 * 2������һ��java����Ĳ��裿
 *      Դ�ļ��������������ֽ������������Ͻ������С�
 * 3��д��������֣���ӡ���������
 *      System.out.println("д���������");
	     Scanner sc = new Scanner(System.in);
	     String ss =  sc.next();
	     System.out.println("��ӡСƱ��");
	     System.out.println("����"+ss);
 * 4��ʲô�Ǳ�ʶ������ʶ������������
 *      java�а����ࡢ�������������ͱ���������
 *      ������Ӣ����ĸ�����֡��»��ߡ���Ԫ�����(���������ֿ�ͷ�������ùؼ�������ʾ��ʶ��)
 * 5��Java���������ͷּ��࣬������������������Щ��
 *      ���� �����������͡�������������
 *      �����������ͣ� byte��short��int��long��float��double��boolean��char
 * 6���Ӽ����Ͻ�����������˫���ȵĸ����ͣ������ǵļӼ��˳��� 
 * */
import java.lang.Thread.State;
import java.util.Scanner;


public class Text10work {
static {

		System.out.println("������㷨");
	}
      
	
public static void main(String[] args) {
	
	Text10work t = new Text10work();
	

	System.out.println("�ӷ�������-1");
	System.out.println("�˷�������-2");
	System.out.println("����������-3");
	System.out.println("����������-4");
	Scanner sc = new Scanner(System.in);
	int ss = sc.nextInt();
	switch (ss) {
    	case -1:
    		System.out.println("������������");
    		System.out.println(t.jiafa());
		
		    break;
       case -2:
    	    System.out.println("������������");
   		    System.out.println(t.chengfa());
		
		    break;
       case -3:
    	   System.out.println("������������");
   		   System.out.println(t.jianfa());
	
	         break;
       case -4:
    	   System.out.println("������������");
   		   System.out.println(t.chufa());	
	
	         break;

	default:
		    System.out.println("������-1��-2��-3��-4");
		     
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
