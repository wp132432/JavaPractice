/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class CarTest {
	public static void main(String[] args) {
		Car Hyundai = new Car();
		Car Gia = new Car();
		Car samsung = new Car();
		
		Hyundai.setCompany("현대자동차");
		Hyundai.setModel("제네시스");
		Hyundai.setColor("검정색");
		Hyundai.setMaxSpeed(225);
		Hyundai.setPrice(50000000);
		
		Gia.setCompany("기아자동차");
		Gia.setModel("K7");
		Gia.setColor("흰색");
		Gia.setMaxSpeed(246);
		Gia.setPrice(40000000);
		
		samsung.setCompany("삼성자동차");
		samsung.setModel("SM7");
		samsung.setColor("회색");
		samsung.setMaxSpeed(200);
		samsung.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >> ");
		System.out.println("제조사명 : " + Hyundai.getCompany());
		System.out.println("모델명 : " + Hyundai.getModel());
		System.out.println("색상 : " + Hyundai.getColor());
		System.out.println("최대속도 : " + Hyundai.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", Hyundai.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + Gia.getCompany());
		System.out.println("모델명 : " + Gia.getModel());
		System.out.println("색상 : " + Gia.getColor());
		System.out.println("최대속도 : " + Gia.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", Gia.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + samsung.getCompany());
		System.out.println("모델명 : " + samsung.getModel());
		System.out.println("색상 : " + samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", samsung.getPrice()) + "원");
		System.out.println();
	}

}
