/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(this.model+"의 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println(this.model+"의 전원을 끕니다.");
	}
	public void pay() {
		System.out.println(" 결제합니다.");
	}
	public void useSpecialFunction(){
		if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		}
		else if(this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}

		
	}
	public String toString() {
		return "모델명 :" + this.model + ", 제조사 :" + this.company + ", 가격 :" + String.format("%,d", this.price) + "원";

	}
	
	

}
