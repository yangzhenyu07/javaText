package com.yzy.work;
/*
 * 1��Java��ƽ̨�м�������ɣ�����ʲô���ã�
 *     javase ��javaee ��javawe
 *       
 * 2������һ��java����Ĳ��裿
 *      Դ�ļ��������������ֽ������������Ͻ������С�
 * 3��д��������֣���ӡ���������
 *      System.out.println("д���������");
	     Scanner sc = new Scanner(System.in);
	     String ss =  sc.next();
	     System.out.println("��ӡСƱ��");
	     System.out.println("����"+ss);
 * 4��ʲô�Ǳ�ʶ������ʶ������������
 *      java�а����ࡢ�������������ͱ���������
 *      ������Ӣ����ĸ�����֡��»��ߡ���Ԫ�����(���������ֿ�ͷ�������ùؼ�������ʾ��ʶ��)
 * 5��Java���������ͷּ��࣬������������������Щ��
 *      ���� �����������͡�������������
 *      �����������ͣ� byte��short��int��long��float��double��boolean��char
 * 
 * ĳװ�ײ��� �������л����豸���й��������豸���� ���������ճ���װ�׳��������������
 * �����豸�Ļ�����Ϣ���� ��� �ͺ� ��;...���⿨����Ҫ�������� ���ճ���¼�ؿ��� װ�׳���¼����
 *
 * */

interface Zhongliang{       //����   
	void yongtu01();
	}
interface wuqi{                     //����
	void yongtu();
}
interface  zaike{                   //�ؿ�
	void yongtu00();
}
abstract class Vehicle{
	public int id;                 //���
	public int xinghao;        //�ͺ�
	public String yongtu;     //��;
	public void setId(int id) {
		this.id = id;
	}
	public void setXinghao(int xinghao) {
		this.xinghao = xinghao;
	}
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	abstract void calVehicle(int id,int xinghao,String yongtu);	
}
 class kache extends Vehicle implements Zhongliang{                     //����
	 public void yongtu01(){
		 int zhongliang = 10000000;                                   
		 System.out.println("�������"+zhongliang+"��");
	 }	
	public void calVehicle(int id,int xinghao,String yongtu){
		this.id = id;
		this.xinghao = xinghao;
		this.yongtu = yongtu;	
		System.out.println("������");
		System.out.println("��ţ�"+id+"���ͺţ�"+xinghao+"����;��"+yongtu);
	}
 }
	 class jipuche extends Vehicle implements zaike{                          //���ճ�
	          public void yongtu00(){
	        	  int zaike = 8;
	        	  System.out.println("�ؿ�������"+zaike);
	          }
			public void calVehicle(int id,int xinghao,String yongtu){
				this.id = id;
				this.xinghao = xinghao;
				this.yongtu = yongtu;
				System.out.println("���ճ���");
				System.out.println("��ţ�"+id+"���ͺţ�"+xinghao+"����;��"+yongtu);
			}
	 }
    class zhuangjiache extends Vehicle implements wuqi{                //װ�׳�
    	
            public void yongtu(){
                 String wuqi ="����ǹ";
                 System.out.println("����ӵ�У�"+wuqi);
            }
			public void calVehicle(int id,int xinghao,String yongtu){
				 this.id = id;
				 this.xinghao = xinghao;
				 this.yongtu = yongtu;
			     System.out.println("װ�׳���");
				 System.out.println("��ţ�"+id+"���ͺţ�"+xinghao+"����;��"+yongtu);
			}	
    }
    public class Work02װ�ײ��ӣ�{
    	public static void main(String[] args) {
    		kache i = new kache();
    		i.calVehicle(100011, 4564515,"����");
    		i.yongtu01();
    		jipuche j =new jipuche();
    		j.calVehicle(10022, 13535, "�ػ�");
    		j.yongtu00();
    		zhuangjiache k =new zhuangjiache();
    		k.calVehicle(10054, 12345, "����");
    		k.yongtu();	
    	}
    	}

