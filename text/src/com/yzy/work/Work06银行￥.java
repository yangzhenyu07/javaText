package com.yzy.work;

import java.util.Scanner;

/*1�������ܲ������ظ���ķ��� �� ��д���෽�����������
 *     ���಻�����ظ���       ������д����ķ��������ظ÷���
 * 2���ӿںͳ�����Ĳ�ͬ
 *      �ӿڿ��Զ�̳� �� �������಻��
 * 3���ڹ��췽���п���ͬʱʹ��this��super�ؼ�����
 *        ���ܣ���Ϊ�ڸ����в���ʹ��super �ؼ���
 * 4���ڽӿ��ܲ�����������  �ڽӿ����ܲ��ܶ���ǳ��󷽷�
 *      ���ܣ��ӿ�ֻ�г����ͷ�����û�б����ͷ�����ʵ�֣�ֻ�ܶ���static final���͵ı��� ���Ǿ��ǳ�������
 *      ���ܣ��ӿ��ж��ǳ��󷽷����ڽӿ���Ĭ��Ϊ���󷽷���������ȿ��Գ��󷽷�Ҳ���Էǳ��󷽷���
 * 5���ڲ���������ĳ�Ա�������ڲ������Ƿ���Ч
 *       ��Ч
 * 6������һ��Account��   ģ�������˺�  �˺� ��� ���� ��� ȡ��
 *      ��������  ��ǿ� ���ÿ��� ͸֧���ƣ�
 * 7�����ýӿںͼ̳л���  ������  ����  ���� �����ӿڵĶ���   ��������ӿڶ���һ�������ĳ��󷽷�  ��
 *      ����ӿڶ���һ���Է�˯�� �������󷽷� ����ӿڶ��� ˼ά��ѧϰ�������󷽷�  ����һ����ͨ����ʵ��
 *      ���������ӿڵĳ��󷽷�
 * 
 * */
interface Overdraft              //͸֧����
{                     
	void show();
}
abstract class Account
{  
	String ID;
	double rate;
	//double balance;
	abstract void bankAccountNumber();
	abstract double  getMoney(double a );              //ȡ��
	abstract double setMoney(double a);               //���
	abstract double yue();
}
class Debit  extends Account               //��ǿ�
{
	double balance=10000;
	
	void bankAccountNumber() 
	{
	      ID ="45387874385793384";
		   rate = 0.54;
	    System.out.println("��ǿ��˺ţ�"+ID);
	    System.out.println("��ǿ����ʣ�"+rate);
	    System.out.println("��"+balance);
	}
	double getMoney(double a)     //��ǿ�ȡ��
	{
		if (a<=10000) {
			balance = balance -a;
			System.out.println("������ȡ��������ǿ����:"+balance);
			
		}else{
			System.out.println("��Ǹ��������ǿ����㣡����");
		}
		return balance;		
	}
	double setMoney(double a) {             //��ǿ����		
		  balance = balance +a;
			return balance;
	}
    public double yue(){
		double sum =balance;
		System.out.println("�����ѳɹ�������");
		System.out.println("����"+sum);
	  return sum;
	}
}
class DC  extends Account   implements Overdraft               //���ÿ�
{
	double balance = 5000000;
	void bankAccountNumber()
	{
		 ID ="584946413bdfdf58";
		 rate = 0.74;
		 System.out.println("���ÿ��˺ţ�"+ID);
	    System.out.println("���ÿ����ʣ�"+rate);
	}
	double getMoney(double a)                   //���ÿ�ȡ��
	{
		balance = 5000000 - a;
		
			return balance;
	}
          public  double yue()
          {
        	 double sum =balance;
      		System.out.println("�����ѳɹ�������");
      		System.out.println("����"+sum);
      	    return sum;
           }
	double setMoney(double a) {                    //���ÿ������
		balance = 5000000;
			return balance;
	}

	public void show() {                                          //  ͸֧����
		System.out.println("�Ƿ�鿴�˿���͸֧�޶ȣ�");
		System.out.println("�� ������-1          �� ��������");
		Scanner s =new Scanner(System.in);
		if (s.nextInt() == -1) {
			System.out.println("���ÿ�͸֧����5000000")  ; 
			System.out.println("�Ƿ�ȡ�");
			System.out.println("��(Yes)������-1              ��(No):����-2");
			Scanner sw  = new Scanner(System.in);
	          switch (sw.nextInt()) {
			case -1:
				System.out.println("������ȡ���");
				Scanner sca = new Scanner(System.in);
				double sss = sca.nextDouble();
				getMoney(sss);
				yue();
				break;
		     case -2:
		    	System.out.println("ϵͳ�ѹر�");		
				break;
			default:
				System.out.println("��������ȷ���֣�����");
				break;
			}
		}else {
			System.out.println("�Ƿ�ȡ�");
			System.out.println("�� ������-1          �� ��������");
			Scanner sz =new Scanner(System.in);
	        if (sz.nextInt()==-1) {
	        	System.out.println("����ȡ���");
	        	Scanner sq =new Scanner(System.in);
				getMoney(sq.nextInt());
				yue();
			}else{
				System.out.println("ϵͳ�ѹرգ�����");
			}			
		}          	
	}	
}
public class Work06���У� 
{
	static
	{   
	System.out.println("��ӭ�������в�ѯ������");
	System.out.println("");
	}
public static void main(String[] args)
{
        DC   dc = new DC();                          //���ÿ�
        Debit  debit = new Debit();               //��ǿ�
        System.out.println("��ѡ���ǿ�/���ÿ���");
    	System.out.println("ѡ���ǿ�������-1");
    	System.out.println("ѡ�����ÿ�������-2");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		
			if (g==-1) 
			{
				System.out.println("��ӭ�����ǿ�����ҳ�棺");
				System.out.println("");
				debit.bankAccountNumber();
				System.out.println("�Ƿ��ȡ�");
				System.out.println("������-1                    ȡ��:����-2");
				Scanner s  = new Scanner(System.in);
	          switch (s.nextInt()) {
			case -1:
				System.out.println("���������");
				Scanner sca = new Scanner(System.in);
				double sss = sca.nextDouble();
				debit.setMoney(sss);
				debit.yue();
				break;
		     case -2:
		    	 System.out.println("������ȡ���");
				Scanner sa = new Scanner(System.in);
				double ss = sa.nextDouble();
				debit.getMoney(ss);		
				break;
			default:
				System.out.println("��������ȷ���֣�����");
				break ;
			}	
			}else if(g == -2)
			{
				System.out.println("��ӭ�������ÿ�����ҳ�棺");
				System.out.println("");
				dc.bankAccountNumber();
				dc.show();		
			
			}else{
				System.out.println("��������ȷ���֣�����");
			}
}
}
