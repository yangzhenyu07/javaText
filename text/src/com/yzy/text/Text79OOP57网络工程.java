package com.yzy.text;
/*
 * Java���繤��
 * java.net
 * 1��ͨ�ŷ�ʽ
 * �������ӵ� (ͨ��������)   ���������ӵ�(���ݱ�)
 * 2��ͨ��Э��  
 * TCP   �������Э��
 * UDP  �û����ݱ�Э��
 * 127.0.0.1�����㱾��  cmd������ipconfig
 * �׽���ͨ�� IP port �˿ں�  0---65535�˿ں�  ��0-1023�˿ں��������ǲ��ã���Ϊ��ϵͳʹ��  8080
 * �׽���ͨ����TCPЭ��Ϊ����  ͨ��˫�����������׽��ֽ������ӷ�������ͻ���
 * �������� �������� C/S
 * 1�����������׽���  
 *  java.net  ServerSocket
 * ServerSocket(int port)
 * 2���ͻ����׽���  
 * Socket(String host,int port)����host ��ʾҪ���ʵķ�����IP��port��ʾ�������˵Ķ˿ں�
 * �����Ƕ�����һ���ͻ����׽��ֶ��󣬼���ʾ��������׽��ַ���һ���������󣬵�����ͻ��˶�һ����������
 * ������������ʱ���ᰴ�շ������Ⱥ�˳��������˵������жӣ��У����Ƚ��ȳ���������
 * ���ͨ���׽��ֽ������ݴ���   DateInputStream
 * ���������󴴽�ʱͨ���ͻ����׽Ӷ������
 * getInputStream()                   getOutputStream()
 * Socket socket = new Socket("127.0.1",9999);
 * DataInputStream in = new DataInputStream(socket.getInputStream());	
 * DataOutputStream out = new DataOutputStream(socket.getOutputStream());	
 * �������˶�����Ҫ����accept()�������һ��Socket����   ��ȡ������������ӵĶ���
 * ServerSocket socket = new ServerSocket(9999);
 * socket client = server.accept;
 * DataInputStream in = new DataInputStream(client.getInputStream());	
 * DataOutputStream out = new DataOutputStream(client.getOutputStream());	
 * 
 * */
public class Text79OOP57���繤�� {

}
