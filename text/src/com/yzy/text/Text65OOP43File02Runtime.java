package com.yzy.text;
/*
 *  Runtime getRuntime()  exec()              执行文件时用   必须要有路径
 * */
import java.io.File;

public class Text65OOP43File02Runtime {
public static void main(String[] args) {
	try {
		Runtime re = Runtime.getRuntime();   //  Runtime getRuntime()  exec()              执行文件时用   必须要有路径
		File f = new File("");
		re.exec(f.getAbsolutePath());            //  Runtime getRuntime()  exec()              执行文件时用   必须要有路径
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
