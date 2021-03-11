package com.yzy.practice;

import java.util.ArrayList;
import java.util.List;

class A{	
}
class B extends A{
}
class C extends B{
}
public class Test {

	public static List<B> b = new ArrayList<>();
	public static List<C> c = new ArrayList<>();
	public static List<A> a = new ArrayList<>();
	
	public static void main(String[] args) {
		List<? extends B> listextends = null;
		List<? super B> listsuper = null;
		//? extends B   表示参数化类型可能是T 或是 T的派生类(子类);
		//listextends = Test.a;  //报错
		listextends = Test.b;
		listextends = Test.c;

		//<? super T> 表示参数化类型可能是T 或是 T的基类(父类);
		listsuper  = Test.a;
		listsuper  = Test.b;
		//listsuper  = Test.c;  //报错

	}
}
