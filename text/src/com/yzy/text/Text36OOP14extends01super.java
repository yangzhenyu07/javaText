package com.yzy.text;
/*
 * 父类中私有的变量，子类不能继承，但子类继承父类中的方法，这个方法要用到父类赋私有变量
 * */
class Father{
	private int x = 2;          //私有化
	public int y=1;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;               //this   局部变量和成员变量重名时用
	}
}
class Son00 extends Father{
	int y; 
	public int getY() {
		y = super.y;         //当子类成员变量与父类成员变量重名时，用 super，表示可以用父类的成员变量，
		                           //要不然父类的成员变量会被隐藏
		return y;
	}
	public void setY(int k) {	
		y=super.y ;
		y = k;
	}	
}
public class Text36OOP14extends01super {
public static void main(String[] args) {
	Son00 s = new Son00();
           
	System.out.println(	s.getX()       ); //调用父类的方法，这个方法用上了父类的私有化变量
	System.out.println(s.getY());
	
}
}
