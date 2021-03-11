package com.yzy.practice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Yzy{
	private String age;
	private String name ;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
public class P13 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
    	Yzy y = new Yzy();
    	y.setAge("32");
    	Method method = Yzy.class.getMethod("getAge");
    	//≤Â»Î
    	 String age = (String) method.invoke(y);
    	System.out.println(age);
	}
}
