package com.yzy.text;

import java.util.Stack;

/*�쳣
 * ����                                               �쳣��
 * 1���������                                    *    java �ı��������벶����������з�����ʱ���쳣 ��                                             
 * ��1����С����                                 *    ��������ʱ�쳣���Բ�������
 * ��2��δ����ı���                           *    ������ϵͳ�쳣
 * ��3��ʹ��δ��ʼ���ı���                 *     ClassNotFoundException      δ�ҵ���װ��ʹ�õ����쳣
 * ��4������������������Ͳ�ƥ��        *    ArrayIndexOfBoundsException     �����±�Խ��
 * ��5����������©�ֺ�                    *     FileNotFoundException          �ļ�δ�ҵ��쳣  IO
 * ��6�����Ų�ƥ��                              *     IOException                          ��������쳣
 * 2�����д���                                    *     NullPointerException             ��ָ���쳣
 *   �±�Խ��                                       *     InterruptedException             ����쳣  �߳�
 *   ..........                                            *     UnknowHostException          �޷�ȷ����������ַ
 *   ---------------                               *     ArithmeticException              �����쳣����Ϊ0
 *                                                          try{
 *                                                                   java  ����
 *                                                          }catch���쳣���� ���������󣩣�{
 *                                                                       �쳣���������
 *                                                          }finally{
 *                                                                     Java����
 *                                                          }
 * */
public class Text44OOP22�쳣
{
	
		static void Proc(int sel){                                     //�෽��
			System.out.println("�����"+sel);
			try {
				if(sel ==0){
					System.out.println("û�в�׽���쳣");
					return;
				}else if(sel == 1){
					int i = 0;
					int j =4/i;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("����"+e);
			}catch(Exception e){
				System.out.println("����"+e);
			}finally{
				System.out.println("����ִ�����");
			}
		}
public static void main(String[] args) {
	int a[] = {1,2,3};
	for (int i = 0; i <3; i++) {
		System.out.println(a[i]);   //��i<=3ʱ���   java.lang.ArrayIndexOutOfBoundsException: 3
		}
	    Proc(0);
	    Proc(1);
}
}	


