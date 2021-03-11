package com.yzy.text;
/*
 * 数据报通信 UDP
 * DatagramSocket    程序之间建立数据报的通信 
 * DatagramPacket    表示一个数据报
 * 构造方法：
 * DatagramSocket ()
 * DatagramSocket (int port)
 * DatagramSocket (int port,InetAddress  al)     al表示可用地址
 * SocketException 套接字异常，不能抛出
 * (1)DatagramSocket (byte buf[],int len) buf数组指明数组存储的位置，len代表存入buf数组的个数 
 * (2)DatagramSocket (byte buf[],int len,int port ,InetAddress al)
 * (3)DatagramSocket (byte buf[],int offset,int len)  offset指明了数组从哪个位置存储数据
 *  (4)DatagramSocket (byte buf[],int offset,int len，int port ,InetAddress al)
 *  (1)和(3)用来创建接受数据的对象，调用receive() 一直等待数据报的到来
 *  (2)和(4)用来创建发送数据报给远程节点对象  是通过send()来实现
 * */
public class Text82OOP60数据报通信 {
public static void main(String[] args) {
	
}
}
