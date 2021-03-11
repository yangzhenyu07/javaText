package com.yzy.text;
/*
 * Java网络工程
 * java.net
 * 1、通信方式
 * 面向连接的 (通过第三方)   面向无连接的(数据报)
 * 2、通信协议  
 * TCP   传输控制协议
 * UDP  用户数据报协议
 * 127.0.0.1就是你本机  cmd下输入ipconfig
 * 套接字通信 IP port 端口号  0---65535端口号  在0-1023端口号以内我们不用，因为被系统使用  8080
 * 套接字通信以TCP协议为基础  通信双方首先利用套接字建立连接发出请求客户端
 * 接受请求 服务器端 C/S
 * 1、服务器端套接字  
 *  java.net  ServerSocket
 * ServerSocket(int port)
 * 2、客户端套接字  
 * Socket(String host,int port)参数host 表示要访问的服务器IP，port表示服务器端的端口号
 * 当我们定义了一个客户端套接字对象，即表示向服务器套接字发出一个连接请求，当多个客户端对一个服务器端
 * 发出连接请求时，会按照发出的先后顺序进入服务端的连接列队，列，按先进先出建立连接
 * 如何通过套接字进行数据传递   DateInputStream
 * 数据流对象创建时通过客户端套接对象完成
 * getInputStream()                   getOutputStream()
 * Socket socket = new Socket("127.0.1",9999);
 * DataInputStream in = new DataInputStream(socket.getInputStream());	
 * DataOutputStream out = new DataOutputStream(socket.getOutputStream());	
 * 服务器端对象需要调用accept()方法获得一个Socket对象   获取与服务器端连接的对象
 * ServerSocket socket = new ServerSocket(9999);
 * socket client = server.accept;
 * DataInputStream in = new DataInputStream(client.getInputStream());	
 * DataOutputStream out = new DataOutputStream(client.getOutputStream());	
 * 
 * */
public class Text79OOP57网络工程 {

}
