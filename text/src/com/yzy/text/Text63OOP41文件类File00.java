package com.yzy.text;
/*
 * java.io.File     文件类  抽象类  主要处理磁盘文件相关信息  
 *3种构造方法：1、File(String filename)          创建一个为filename的文件类
 *                     2、File(String path,String filename) 创建一个文件名为filename 路径为Path的File类
 *                     3、File(File f,String filename) f(指定目录) 
 *                                 列如：File file = new File("c:\\test\\abc.txt");
 *                                           File file = new File("c:\\test","abc.txt");  //查看
 *                                           File createNewFile(); 创建一个文件
 *                                           1、boolean canRead() 检查文件是否可读
 *                                           2、boolean canWrite() 检查文件是否可写
 *                                           3、int compareTo(File obj)按字典序
 *                                           4、boolean createNewFile ()    产生一个空文件
 *                                           5、boolean  delete()  删除 文件
 *                                           6、boolean  exists()  盘文件是否存在
 *                                           7、String  getAbsolutePath() 获取文件的绝对路径
 *                                           8、String  getName()    获取文件名
 *                                           9、boolean  isDirectory()
 *                                           10、boolean isFile() 判断是否为文件
 *                                           11、 boolean isHidden()  判断是否为隐藏目录或文件
 *                                           12、long lastModified()   文件最后修改时间
 *                                           13、long length()   文件的大小 (容量)字节
 *                     目录操作：
 *                     mkdir() 创建一个目录
 *                     File f = new File("c:\\text");
 *                     f.mkdir();
 *                     public String[] list()  以字符串的形式返回目录下的全部文件
 *                     public File[] listFile() 用file对象形式返回目录下的文件
 *                     Runtime getRuntime()  exec()              执行文件时用   必须要有路径
 * */
import java.io.File;
import java.io.IOException;

public class Text63OOP41文件类File00 {
public static void main(String[] args) throws IOException {
	File f = new File("f:\\Test\\abc.txt");
	//f.mkdir();
	f.createNewFile();
	System.out.println("文件名是"+f.getName());
	System.out.println("路径是"+f.getAbsolutePath());
	if (f.exists()) {
		System.out.println();
		System.out.println("路径存在:");
		System.out.println("是否可读："+f.canRead());         //是否可读
		System.out.println("是否可写："+f.canWrite());        //是否可写
		System.out.println("容量："+f.length());             //容量
		System.out.println("最后修改时间："+f.lastModified());   //最后修改的时间
		System.out.println("是否为隐藏目录："+f.isHidden());      //是否为隐藏目录
	}else{
		System.out.println("路径不存在");
	}
}
}
