package com.yzy.text;
/*
 * �̳е�����
 * 1���������͸�����ͬһ����    �����ܼ̳и�����public protected ȱʡ �ĳ�Ա�����ͷ���
 * 2������͸����ڲ�ͬ�İ��У�  �����ܼ̳и�����public protected  �ĳ�Ա�����ͷ���
 * �̳е�ԭ��
 * 1������ֻ����һ��ֱ�Ӹ���
 * 2�̳о��д�����
 * b�̳�a c�̳�b    a��c�ļ�Ӹ���    b��c��ֱ�Ӹ���
 * 3���̳в���ѭ��
 * 4��Java�г���Object ,��֮��ʣ�µ��඼�и���
 * �������Ĺ��� ��  ���������������Ĺ��췽������һ������Ķ���ʱ������Ĺ��췽�������ȵ��ø����ĳһ�����췽����
 * �������Ĺ��췽��û��ָ��������Ǹ����췽��������͵��ø����Ĭ�ϵĿ������췽��
 * --------------------------
 * 
 * */
class Base{
    public int publicVarofBase;
    private  int  privateVarofBase;
    int defaultVarofBase;
    protected void methodofBase(){
    	
    }
}
class sub extends  Base{
	public void methodofSub(){
		publicVarofBase = 2 ;
		//privateVarofBase = 2;       �̳в���privateVarofBase   ��ΪprivateVarofBase��˽�е�
		 defaultVarofBase = 2;
		 methodofBase();		
	}
}

public class Text35OOP13extends00 {
public static void main(String[] args) {
	sub s = new sub();
	s.publicVarofBase = 3;
	s.defaultVarofBase = 3;
	s.methodofBase();
	s.methodofSub();
	//s.privateVarofBase = 3;         ���ò��� ��ΪprivateVarofBase��˽�е�
}
}
