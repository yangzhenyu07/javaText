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
		//? extends B   ��ʾ���������Ϳ�����T ���� T��������(����);
		//listextends = Test.a;  //����
		listextends = Test.b;
		listextends = Test.c;

		//<? super T> ��ʾ���������Ϳ�����T ���� T�Ļ���(����);
		listsuper  = Test.a;
		listsuper  = Test.b;
		//listsuper  = Test.c;  //����

	}
}
