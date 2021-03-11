package com.yzy.text;
/*
 * java.io.File     �ļ���  ������  ��Ҫ��������ļ������Ϣ  
 *3�ֹ��췽����1��File(String filename)          ����һ��Ϊfilename���ļ���
 *                     2��File(String path,String filename) ����һ���ļ���Ϊfilename ·��ΪPath��File��
 *                     3��File(File f,String filename) f(ָ��Ŀ¼) 
 *                                 ���磺File file = new File("c:\\test\\abc.txt");
 *                                           File file = new File("c:\\test","abc.txt");  //�鿴
 *                                           File createNewFile(); ����һ���ļ�
 *                                           1��boolean canRead() ����ļ��Ƿ�ɶ�
 *                                           2��boolean canWrite() ����ļ��Ƿ��д
 *                                           3��int compareTo(File obj)���ֵ���
 *                                           4��boolean createNewFile ()    ����һ�����ļ�
 *                                           5��boolean  delete()  ɾ�� �ļ�
 *                                           6��boolean  exists()  ���ļ��Ƿ����
 *                                           7��String  getAbsolutePath() ��ȡ�ļ��ľ���·��
 *                                           8��String  getName()    ��ȡ�ļ���
 *                                           9��boolean  isDirectory()
 *                                           10��boolean isFile() �ж��Ƿ�Ϊ�ļ�
 *                                           11�� boolean isHidden()  �ж��Ƿ�Ϊ����Ŀ¼���ļ�
 *                                           12��long lastModified()   �ļ�����޸�ʱ��
 *                                           13��long length()   �ļ��Ĵ�С (����)�ֽ�
 *                     Ŀ¼������
 *                     mkdir() ����һ��Ŀ¼
 *                     File f = new File("c:\\text");
 *                     f.mkdir();
 *                     public String[] list()  ���ַ�������ʽ����Ŀ¼�µ�ȫ���ļ�
 *                     public File[] listFile() ��file������ʽ����Ŀ¼�µ��ļ�
 *                     Runtime getRuntime()  exec()              ִ���ļ�ʱ��   ����Ҫ��·��
 * */
import java.io.File;
import java.io.IOException;

public class Text63OOP41�ļ���File00 {
public static void main(String[] args) throws IOException {
	File f = new File("f:\\Test\\abc.txt");
	//f.mkdir();
	f.createNewFile();
	System.out.println("�ļ�����"+f.getName());
	System.out.println("·����"+f.getAbsolutePath());
	if (f.exists()) {
		System.out.println();
		System.out.println("·������:");
		System.out.println("�Ƿ�ɶ���"+f.canRead());         //�Ƿ�ɶ�
		System.out.println("�Ƿ��д��"+f.canWrite());        //�Ƿ��д
		System.out.println("������"+f.length());             //����
		System.out.println("����޸�ʱ�䣺"+f.lastModified());   //����޸ĵ�ʱ��
		System.out.println("�Ƿ�Ϊ����Ŀ¼��"+f.isHidden());      //�Ƿ�Ϊ����Ŀ¼
	}else{
		System.out.println("·��������");
	}
}
}
