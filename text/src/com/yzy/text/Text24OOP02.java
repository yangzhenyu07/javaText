package com.yzy.text;

public class Text24OOP02 {
	public static void main(String[] args) {
		Text24OOP02 r = new Text24OOP02(130320129,"������",12);
		System.out.println("ѧ�ţ�"+r.stu_Code+",������"+r.stuName+",�꼶��"+r.stuDeptCode);
		
	}
	
	int stu_Code;
	String stuName;
     int stuDeptCode;
    public Text24OOP02() {
    	stu_Code =10011;
    	 stuName = "";
         stuDeptCode = 11;
	}
	public Text24OOP02(int stu_Code, String stuName, int stuDeptCode) { //ϰ�߳�Ա������ֵ�ڹ��췽����
		                                                                                                         //���췽��ϰ��д����������
	
		this.stu_Code = stu_Code;
		this.stuName = stuName;
		this.stuDeptCode = stuDeptCode;
	}
    
}

	
	
