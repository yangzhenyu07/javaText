package com.yzy.text;
/*
 *  Runtime getRuntime()  exec()              ִ���ļ�ʱ��   ����Ҫ��·��
 * */
import java.io.File;

public class Text65OOP43File02Runtime {
public static void main(String[] args) {
	try {
		Runtime re = Runtime.getRuntime();   //  Runtime getRuntime()  exec()              ִ���ļ�ʱ��   ����Ҫ��·��
		File f = new File("");
		re.exec(f.getAbsolutePath());            //  Runtime getRuntime()  exec()              ִ���ļ�ʱ��   ����Ҫ��·��
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
