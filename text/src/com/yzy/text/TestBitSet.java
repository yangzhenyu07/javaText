package com.yzy.text;

import java.util.BitSet;
/**
 * set(BitSet)  将指定索引处的位设置为 true
 * length()  最高索引值加1
 * and(BitSet)  逻辑与操作 取两个集合中相同的值
 * andNot(BitSet) 取对象集合  减去 ( 两个集合中相同的值)
 * or(BitSet) 逻辑或操作 取两个集合中所有的值
 * xor(BitSet) 异或操作 取两个集合中不相同的数据
 * */
public class TestBitSet {
	 private    BitSet bits1 = new BitSet(16);
	 private    BitSet bits2 = new BitSet(16);
	public  TestBitSet(){
		 // 初始化插入测试数据
		 for(int i = 0; i < 16; i++) {
			    //set() 将指定索引处的位设置为 true
	            if((i % 2) == 0) this.bits1.set(i);
	            if((i % 3) != 0) this.bits2.set(i);
	     } 
	 }
	 public static void zs() {
		    //展示初始化值
		    TestBitSet t = new TestBitSet();
	        System.out.printf("bits1初始化值:%s,最高索引加1::%d\n",t.bits1,t.bits1.length());
	        System.out.printf("bits2初始化值:%s,最高索引加1::%d\n",t.bits2,t.bits2.length());
	 }
	 public static void main(String[] args) {
		    zs();   
	        new Thread(new Runnable() {			
				@Override
				public void run() {
					 //and bits 逻辑与操作 取两个集合中相同的值
					//0⊕0=1，1⊕0=0，0⊕1=0，1⊕1=1（同为1，异为0）
					TestBitSet t = new TestBitSet();
			        t.bits2.and(t.bits1);
			        System.out.printf("\n["+Thread.currentThread().getName()+"]bits2 AND bits1[与操作]: %s,最高索引加1::%d",t.bits2,t.bits2.length());
					
				}
			}).start();
	        new Thread(new Runnable() {			
				@Override
				public void run() {
					 //andNot bits 取bits2集合  减去 ( 两个集合中相同的值)
					TestBitSet t = new TestBitSet();
			        t.bits2.andNot(t.bits1);
			        System.out.printf("\n["+Thread.currentThread().getName()+"]bits2 andNot bits1[与操作]: %s,最高索引加1::%d",t.bits2,t.bits2.length());
					
				}
			}).start();
	        new Thread(new Runnable() {			
				@Override
				public void run() {
					 // OR bits 逻辑或操作 取两个集合中所有的值
					//0⊕0=1，1⊕0=1，0⊕1=1，1⊕1=1（同为1，异为1）
					TestBitSet t = new TestBitSet();
			        t.bits2.or(t.bits1);
			        System.out.printf("\n["+Thread.currentThread().getName()+"]bits2 OR bits1[或操作]: %s,最高索引加1::%d",t.bits2,t.bits2.length());
					
				}
			}).start();
	        new Thread(new Runnable() {			
				@Override
				public void run() {
			        // XOR bits 异或操作 取两个集合中不相同的数据
					//0⊕0=0，1⊕0=1，0⊕1=1，1⊕1=0（同为0，异为1）
					TestBitSet t = new TestBitSet();
			        t.bits2.xor(t.bits1);
			        System.out.printf("\n["+Thread.currentThread().getName()+"]bits2 XOR bits1[异或操作]:%s,最高索引加1::%d ",t.bits2,t.bits2.length());
					
				}
			}).start();
	    }
}
