package com.yzy.text;
/*
 * �ӿڣ��ô�----����Ϊ�˲���Java�еĶ�̳�
 * �ӿ�interface(Ҳ����)   �ӿ������̳�
 * ���� implements �ӿ����֣��ӿ���........
 * �ӿڱ�����֮����ֱ��ʹ�ã�����ͨ��ĳ������ʵ�ָýӿ� ��һ�������ʵ�ֶ���ӿ�
 * һ��������ʵ��ĳ���ӿں������д�ýӿڵ�ȫ������
 * �ӿ��еķ�������public ��ʵ�ֵ�����ҲӦ����public
 * �ӿڱ����̬
 * */
interface interfaceA     {                                //����һ���ӿ� interfaceA
	int a = 1;
	void showA();                                           //�����з�����-------�ӿ�Ҳ�൱�ڳ���
}
interface interfaceB    {                               //����һ���ӿ� interfaceB
	int b = 1;
	void showB();                                          //�����з�����-------�ӿ�Ҳ�൱�ڳ���
}
interface interfaceC   {                               //����һ���ӿ� interfaceC
	int c = 1;
	void showC();                                       //�����з�����-------�ӿ�Ҳ�൱�ڳ���
}
class TextA implements interfaceA, interfaceB, interfaceC{
	public void showA(){                                 //�൱��showA������дһ��
		System.out.println("a ="+a);
	}
	public void showB(){                                 //�൱��showB������дһ��
		System.out.println("b="+a);
	}
	public void showC(){                                 //�൱��showC������дһ��
		System.out.println("c ="+a);
	}
}
public class Text42OOP20interface {
public static void main(String[] args) {
	TextA t= new TextA();
	t.showA();
	t.showB();
	t.showC();
}
}
