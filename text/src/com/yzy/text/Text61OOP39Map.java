package com.yzy.text;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map 散列映射 键值对 可以映射唯一关键字到值  通过关键字可以检索到值
 * HashMap()
 * HashMap(Map m)将Map 创建的对象放入到散列映射中
 *  HashMap(Map a) 创建一个容量为a的散列映射
 *   HashMap(int a , float b) 创建一个容量为a，填充比为b的散列映射      b  0.75
 *   put将元素加入到散列映射中
 *   Set set = hm.entrySet(); //返回包含映射中项的集合
		Iterator i = set.iterator();  //迭代器   作用：得到hashmap中的项
 * */
public class Text61OOP39Map {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("tom", new Double(3434.34)); //键入元素
		hm.put("jskdj", new Double(1234.34));  //new Double(1234.34)为对象
		hm.put("tosdam", new Double(3486.34)); 
		Set set = hm.entrySet(); //返回包含映射中项的集合
		Iterator i = set.iterator();  //迭代器   作用：得到hashmap中的项
		while (i.hasNext()) {//查看是否有下一项  显示元素
			Map.Entry me = (Map.Entry)i.next();   //操作映射，直接输入
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());	
		}
		double balance = ((Double )hm.get("jskdj")).doubleValue();//将tom中的值增加1000
		hm.put("jskdj", new Double(balance + 1000));
		System.out.println("Tom的资金是"+hm.get("tom"));
		System.out.println("jskdi的资金是"+hm.get("jskdj"));
		
	}        
}
