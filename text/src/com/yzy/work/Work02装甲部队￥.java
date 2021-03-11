package com.yzy.work;
/*
 * 1、Java的平台有几部分组成，各有什么作用？
 *     javase 、javaee 、javawe
 *       
 * 2、运行一个java程序的步骤？
 *      源文件由虚拟机编译成字节码后，在虚拟机上解释运行。
 * 3、写出你的名字，打印出你的名字
 *      System.out.println("写出你的姓名");
	     Scanner sc = new Scanner(System.in);
	     String ss =  sc.next();
	     System.out.println("打印小票：");
	     System.out.println("姓名"+ss);
 * 4、什么是标识符，标识符的命名规则？
 *      java中包、类、方法、参数、和变量的名字
 *      由任意英文字母、数字、下划线、美元符组成(不能以数字开头、不能用关键字来表示标识符)
 * 5、Java的数据类型分几类，基本的数据类型有哪些？
 *      两类 基本数据类型、引用数据类型
 *      基本数据类型： byte、short、int、long、float、double、boolean、char
 * 
 * 某装甲部队 对其所有机动设备进行管理，机动设备包括 卡车，吉普车，装甲车，分类管理所有
 * 机动设备的基本信息包括 编号 型号 用途...另外卡车需要记载重量 吉普车记录载客数 装甲车记录武器
 *
 * */

interface Zhongliang{       //载重   
	void yongtu01();
	}
interface wuqi{                     //武器
	void yongtu();
}
interface  zaike{                   //载客
	void yongtu00();
}
abstract class Vehicle{
	public int id;                 //编号
	public int xinghao;        //型号
	public String yongtu;     //用途
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
 class kache extends Vehicle implements Zhongliang{                     //卡车
	 public void yongtu01(){
		 int zhongliang = 10000000;                                   
		 System.out.println("最大载重"+zhongliang+"吨");
	 }	
	public void calVehicle(int id,int xinghao,String yongtu){
		this.id = id;
		this.xinghao = xinghao;
		this.yongtu = yongtu;	
		System.out.println("卡车：");
		System.out.println("编号："+id+"，型号："+xinghao+"，用途："+yongtu);
	}
 }
	 class jipuche extends Vehicle implements zaike{                          //吉普车
	          public void yongtu00(){
	        	  int zaike = 8;
	        	  System.out.println("载客人数："+zaike);
	          }
			public void calVehicle(int id,int xinghao,String yongtu){
				this.id = id;
				this.xinghao = xinghao;
				this.yongtu = yongtu;
				System.out.println("吉普车：");
				System.out.println("编号："+id+"，型号："+xinghao+"，用途："+yongtu);
			}
	 }
    class zhuangjiache extends Vehicle implements wuqi{                //装甲车
    	
            public void yongtu(){
                 String wuqi ="机关枪";
                 System.out.println("武器拥有："+wuqi);
            }
			public void calVehicle(int id,int xinghao,String yongtu){
				 this.id = id;
				 this.xinghao = xinghao;
				 this.yongtu = yongtu;
			     System.out.println("装甲车：");
				 System.out.println("编号："+id+"，型号："+xinghao+"，用途："+yongtu);
			}	
    }
    public class Work02装甲部队￥{
    	public static void main(String[] args) {
    		kache i = new kache();
    		i.calVehicle(100011, 4564515,"运人");
    		i.yongtu01();
    		jipuche j =new jipuche();
    		j.calVehicle(10022, 13535, "载货");
    		j.yongtu00();
    		zhuangjiache k =new zhuangjiache();
    		k.calVehicle(10054, 12345, "攻击");
    		k.yongtu();	
    	}
    	}

