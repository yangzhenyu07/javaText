package com.yzy.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.BitSet;
public class TestBitSet1 {
	public static void main(String[] args) {
		    //�����
		    Random random=new Random();
	        List<Integer> list=new ArrayList<>();
	        for(int i=0;i<6;i++)
	        {
	            int randomResult=random.nextInt(10);
	            list.add(randomResult);
	        }
	        System.out.println("����6��0~10���������");
	        list.forEach(v->{
	        	System.out.println(v);
	        });
	       
	        
	        BitSet bitSet=new BitSet(100);
	        for(int i=0;i<list.size();i++)
	        {
	        	//��ָ����������λ����Ϊ true
	            bitSet.set(list.get(i));
	        }
	        //toString() ���ش�λ set ���ַ�����ʾ��ʽ
	        //cardinality() ���ش� BitSet ������Ϊ true ��λ�������Ե�����ʹ��[ȥ�غ�]
	        System.out.printf("�����ȥ�غ���:%s,������%d\n",bitSet.toString(),bitSet.cardinality());
	        int o = 0;
	        List<Integer> l = new ArrayList<Integer>();
	        for (int i = 0; i < 6; i++)
	        {
	        	//����ָ����������λֵ ������
	            if(!bitSet.get(i))
	            {
	            	o++;
	            	l.add(i);
	            }
	        }     
	        System.out.printf("0~6�����������������%d,�ֱ���:\n",o);
	        l.forEach(v->{
	        	System.out.println(v);
	        });
	}
}
