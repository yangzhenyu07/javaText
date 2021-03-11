package com.yzy.text;

import java.util.BitSet;

/**
 * clear()    将此 BitSet 中的所有位设置为 false。
 * clear(index)    将此 BitSet 中的指定位设置为 false。
 * */
public class TestBitSet2 {
   public static void main(String[] args) {
    BitSet bitSet = new BitSet(16);

    for(int i = 0; i < 16; i++) {
	    //set() 将指定索引处的位设置为 true
        if((i % 2) == 0) bitSet.set(i);
    } 
    System.out.printf("bitSet数据%s\n",bitSet.toString());
    BitSet bitSetCopy = (BitSet) bitSet.clone();
    System.out.printf("bitSetCopy数据%s\n",bitSetCopy.toString());
    bitSet.clear(4);
    System.out.printf("bitSet数据%s\n",bitSet.toString());
    bitSet.clear();
    System.out.printf("bitSet数据%s\n",bitSet.toString());

   }
}
