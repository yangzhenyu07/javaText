package com.yzy.text;

import java.util.HashSet;

/*
 * Set ɢ�б�             ----------------------������
 * ɢ���� ��ɢ���� һ���ؼ��ֵ���Ϣ���ݱ�������ȷ����Ψһ��ֵ  �±�
 * Set<E>
 * HashSet ��ϣ��  ˳�򲻹̶�
 * HashSet()
 * HashSet(collection c) ��Clloection �����Ķ�����뵽ɢ�б���
 * HashSet(int a) ����һ������Ϊa��ɢ�м���
 * HashSet(int a , float b) ����һ������Ϊa ����Ϊb��ɢ�м���  b�ĺ�����Ϊ0.75���4��֮3
 * ɢ�м��ϵ�Ԫ������˳��ģ�����ÿ�ε�������ܶ���һ��
 * */
public class Text60OOP38Set {
public static void main(String[] args) {
    HashSet hs =  new HashSet();
    hs.add("B");
    hs.add("A");
    hs.add("C");
    hs.add("D");
    System.out.println(hs);  //�����˳��
}
}
