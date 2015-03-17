package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int money = 1700000;
		int worker = 3;
		int store = 1500;
		long average;
		
		average = (long)money *12* worker * store;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 :" + String.format("%,d",money) + "원");
		System.out.println("점포 내 직원 수 :" + String.format("%,d",worker) + "명");
		System.out.println("점포 수 :" + String.format("%,d",store) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d",average) + "원");
	}

}
