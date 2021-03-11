package com.yzy.text;
/*
 * 可以当做遍历路径下指定后缀文件的时候使用
 * */
import java.io.File;
import java.io.FilenameFilter;

 class FileAccept implements FilenameFilter{   //        FilenameFilter文件名过滤器

	String str = null;
	FileAccept(String s){
		str = "."+s;
	}
	public boolean accept(File dir, String name) {
	
		return name.endsWith(str);                //endsWith()  指定后缀
	}
}
public class Text64OOP42File01FilenameFilter {
public static void main(String[] args) {
	File dir = new File("D:\\MyEclipse 10\\falcard_one\\src\\com\\pactera\\fal\\action");
	FileAccept as = new FileAccept("java");
	String  fileList[] = dir.list(as);
	System.out.println(fileList.length);
	for (int i = 0; i < fileList.length; i++) {
		System.out.println(fileList[i]);
	}
}
}
