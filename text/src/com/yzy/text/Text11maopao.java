package com.yzy.text;
/*
 * ð������
 * */
public class Text11maopao {
	public static void main(String[] args) {
	int [] array = {1,3,5,7,0,4,6,8,9,2}	;                // ��Ա����
	System.out.println("��������֮ǰ��˳��");
	//����forѭ��������
          for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
          //��ð���㷨������
          int temp; //���õ�����������ֵ
          for (int i = 0; i < array.length-1; i++) {          // i Ϊ�ֲ�����   ���ѭ��Ϊ�ȽϵĴ���
			for (int j = 0; j < array.length-i-1; j++) {      
				if (array[j]>array[j+1]) {
					temp  = array[j];                   //���ֵ������������
					array[j ] = array[j+1];              //�����λ�õģ�������ǰ���λ�õģ�����
					array[j+1] = temp;                //���ֵ����[j+1]��λ��					
				}
			}			
		}
          System.out.println();
			System.out.println("��������֮���˳��");
			  for (int k = 0; k< array.length; k++) {
					System.out.println(array[k]); 
	}
	}
	}
