package com.yzy.text;

import java.util.BitSet;

/**
 * clear()    ���� BitSet �е�����λ����Ϊ false��
 * clear(index)    ���� BitSet �е�ָ��λ����Ϊ false��
 * */
public class TestBitSet2 {
   public static void main(String[] args) {
    BitSet bitSet = new BitSet(16);

    for(int i = 0; i < 16; i++) {
	    //set() ��ָ����������λ����Ϊ true
        if((i % 2) == 0) bitSet.set(i);
    } 
    System.out.printf("bitSet����%s\n",bitSet.toString());
    BitSet bitSetCopy = (BitSet) bitSet.clone();
    System.out.printf("bitSetCopy����%s\n",bitSetCopy.toString());
    bitSet.clear(4);
    System.out.printf("bitSet����%s\n",bitSet.toString());
    bitSet.clear();
    System.out.printf("bitSet����%s\n",bitSet.toString());

   }
}
