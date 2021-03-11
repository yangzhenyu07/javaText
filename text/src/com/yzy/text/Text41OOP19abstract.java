package com.yzy.text;
/*
 * 抽象类
 * abstract
 * 方法一般的也是抽象方法（只有方法名没有方法体）
 * java静态方法 私有方法 构造方法不能定义为抽象方法
 * 抽象类不能实例化 只能创建子类
 * 
 * 
 * */
abstract class Shape{                //蓝图
	public String lineColor;
	public String fillColor;
	public void setLineColor(String Color){
		lineColor = Color;
		
	}
	public void setFillColor(String Color){
		fillColor = Color;
		
	}
	abstract void draw();
}

class Rect extends Shape{          //矩形
        float width,height;

        public Rect(float width, float height) {        //相当于方法重写一次

	        this.width = width;
	        this.height = height;
       }
        public void draw() {                  //继承抽象父类时，哪个类要不加abstract，要不重写重写父类的方法
	        System.out.println("矩形：边框颜色"+lineColor+"填充颜色："+fillColor);
	        System.out.println("宽度="+width+"高度 = "+height);
	
       }
}
 class Circle extends Shape{          //  圆型
	 double radius;

	public Circle(double radius) {               //相当于方法重写一次 
		super();
		this.radius = radius;
	}
	 public void draw(){
		 System.out.println("矩形：边框颜色"+lineColor+"填充颜色："+fillColor);
		 System.out.println("半径为"+radius);
	 }
	 
 }
public class Text41OOP19abstract {
public static void main(String[] args) {
	Shape rect = new  Rect(20,10);                               //上转型对象
   rect.setLineColor("黑色");
	
	rect.setFillColor("红色");
	rect.draw();
	Shape rect1 = new Circle(5);                                   //上转型对象
	rect1.setFillColor("红色");
	rect1.setLineColor("蓝色");
	rect1.draw();
			
}
}
