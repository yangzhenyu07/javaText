package com.yzy.text;
/*
 * IndexOf ����
 * substring ����
 * -------String str.sqlit(s,[i]) 
 * s��ѡ���ָ�Ķ������������ַ�����������ʽ�����  
 * i ��ѡ��  �������Ʒ��������е�Ԫ�ظ���
 * replayAll  ����
 * */
import org.omg.CORBA.PUBLIC_MEMBER;

public class Text16IndexOf�����滻 {
public static void main(String[] args) {
	String path ="d:\\doc\\examplel.doc"; 
	int a = path.indexOf("\\");                       //IndexOf ��������˼  
	String oldName = path.substring(a+1);              //substring       ��ȡ����˼    
	//subString(begin,end)   begin-��ʼ������������   end -������������������
	String newName = oldName.replaceAll(".doc", ".java");          //replaceAll  �滻����˼
	System.out.println(a);
	System.out.println(path);
	System.out.println(oldName);
	System.out.println(newName);
}


}
