package com.yzy.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.BitSet;
public class TestBitSet1 {
	public static void main(String[] args) {
		    //随机数
		    Random random=new Random();
	        List<Integer> list=new ArrayList<>();
	        for(int i=0;i<6;i++)
	        {
	            int randomResult=random.nextInt(10);
	            list.add(randomResult);
	        }
	        System.out.println("产生6个0~10的随机数有");
	        list.forEach(v->{
	        	System.out.println(v);
	        });
	       
	        
	        BitSet bitSet=new BitSet(100);
	        for(int i=0;i<list.size();i++)
	        {
	        	//将指定索引处的位设置为 true
	            bitSet.set(list.get(i));
	        }
	        //toString() 返回此位 set 的字符串表示形式
	        //cardinality() 返回此 BitSet 中设置为 true 的位数。可以当总数使用[去重后]
	        System.out.printf("随机数去重后有:%s,数量有%d\n",bitSet.toString(),bitSet.cardinality());
	        int o = 0;
	        List<Integer> l = new ArrayList<Integer>();
	        for (int i = 0; i < 6; i++)
	        {
	        	//返回指定索引处的位值 布尔型
	            if(!bitSet.get(i))
	            {
	            	o++;
	            	l.add(i);
	            }
	        }     
	        System.out.printf("0~6不在上述随机数中有%d,分别是:\n",o);
	        l.forEach(v->{
	        	System.out.println(v);
	        });
	}
}
