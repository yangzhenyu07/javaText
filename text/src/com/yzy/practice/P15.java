package com.yzy.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class P15 {
	   public  AtomicInteger inc = new AtomicInteger();
	   public   void increaseAtomicInteger() {
		    // ��ȡ��ֵ��һ
	        inc.getAndIncrement();
	    }
	public static void main(String[] args) {
		P15 p = new P15();
		//��ȡ��ǰֵ
		int o = p.inc.get();
		System.out.println(o);
		p.increaseAtomicInteger();
		int o1 = p.inc.get();
		System.out.println(o1);
		//���ó�ʼֵ
		p.inc.set(0);
		int o2 = p.inc.get();
		System.out.println(o2);
		p.increaseAtomicInteger();
		int o3 = p.inc.get();
		System.out.println(o3);
	}
}
