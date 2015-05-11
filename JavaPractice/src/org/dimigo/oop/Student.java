/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Student
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 20.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Student {
	
	private int gisu;
	private int grade;
	private int number;
	private int ban;
	private String name;
	private String address;
	private String phone;
	

	public Student(int gisu,int grade,int ban,int number, String name, String address, String phone){

		this.gisu = gisu;

		this.grade = grade;

		this.ban = ban;

		this.number = number;

		this.name = name;

		this.address = address;

		this.phone = phone;

	}

	

	public Student(int gisu,int grade,int ban,int number, String name, String address){

		this(gisu,grade,ban,number, name, address, "휴대폰없음");

	}

	

	public Student(int gisu,int grade,int ban,int number, String name){

		this(gisu,grade,ban,number,name,"주소없음");

	}

	

	public Student(int gisu,int grade,int ban,int number){

		this(gisu,grade,ban,number,"이름없음");

	}

 

 

 

	public void printStuednt(){

		System.out.println("<<학생 정보 출력>>");

		System.out.println("1. 학번 : " + gisu + grade + ban + String.format("%02d",number));

		System.out.println("2. 이름 : " + name);

		System.out.println("3. 주소 : " + address);

		System.out.println("4. 휴대폰번호 : "+ phone);

		System.out.println();

	}

	

 

	
	public int getgisu() {
		return gisu;
	}
	public int getgrade() {
		return grade;
	}
	public int getban() {
		return ban;
	}
	public int getnumber() {
		return number;
	}
	public String getname() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public String getphone(){
		return phone;
	}


}
