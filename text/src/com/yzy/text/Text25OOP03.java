package com.yzy.text;
/*��ϰ��
 * ���졢����һ��ʹ��
 * 
 * */
class Student1{
	int stu_Code;
	String stuName;
     int stuDeptCode;
    public Student1() {                                                          //�����޲ι��췽��
    	
    }
	public Student1(int stu_Code, String stuName, int stuDeptCode) {            //����û�з���ֵ

		this.stu_Code = stu_Code;
		this.stuName = stuName;
		this.stuDeptCode = stuDeptCode;
	}
	void   setStudentCode(int code){            //��ֲ�������Ϊ��Ա������ֵʹ��
		      
		        stu_Code = code;
	}
	void   setStuName(String code){
	      
        stuName= code;
}
	void   setstuDeptCode(int dcode){
	      
        stuDeptCode = dcode;
}
	public void print(){                       //����һ��print������������ӡѧ����Ϣ
		System.out.println("ѧ�ţ�"+stu_Code);
		System.out.println("������"+stuName);
		System.out.println("�꼶��"+stuDeptCode);
		
		
	}
	
}
public class Text25OOP03 {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.stuName = "������";
		stu.setStudentCode(0001);
		stu.setstuDeptCode(13);
		Student1 stu1 = new Student1(0002,"������",13);
		stu.print();
		stu1.print();

	}

}
