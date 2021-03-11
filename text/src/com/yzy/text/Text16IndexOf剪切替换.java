package com.yzy.text;
/*
 * IndexOf 方法
 * substring 方法
 * -------String str.sqlit(s,[i]) 
 * s必选，分割的东西，可以是字符串或正则表达式或对象  
 * i 可选项  用来限制返回数组中的元素个数
 * replayAll  方法
 * */
import org.omg.CORBA.PUBLIC_MEMBER;

public class Text16IndexOf剪切替换 {
public static void main(String[] args) {
	String path ="d:\\doc\\examplel.doc"; 
	int a = path.indexOf("\\");                       //IndexOf 检索的意思  
	String oldName = path.substring(a+1);              //substring       截取的意思    
	//subString(begin,end)   begin-起始索引（包括）   end -结束索引（不包括）
	String newName = oldName.replaceAll(".doc", ".java");          //replaceAll  替换的意思
	System.out.println(a);
	System.out.println(path);
	System.out.println(oldName);
	System.out.println(newName);
}


}
