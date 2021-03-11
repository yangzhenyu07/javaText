package com.yzy.text;
/*
 * 泛型接口
 * 利用泛型类声明接口来唱歌
 * */
interface Computer<E,F>{  //定义两个泛型
	void makechorue(E x,F y);
}
class Chorus<E,F>implements Computer <E,F>{


	public void makechorue(E x, F y) {
		x.toString();  //因为不知道什么类型，所以统一变成字符串
		y.toString();
		
	}
	
}
class Musical{
	public String toString(){
		System.out.println("| 5 6 3-| 5  17  56|");
		return "";                                  //弹出String型
	}
}
class Singer{
	public String toString(){
		System.out.println("好一朵茉莉花");
		return "";
	}
}
public class Text57OOP35泛型接口 {
public static void main(String[] args) {
	Chorus<Singer, Musical> model = new Chorus<Singer,Musical>();
	Singer singer = new Singer();
	Musical musical= new Musical();
	model.makechorue(singer, musical);
}
}
