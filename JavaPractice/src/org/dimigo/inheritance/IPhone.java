/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ IPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 27.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class IPhone extends SmartPhone {

	/**
	 * @param string
	 * @param string2
	 * @param i
	 */
	public IPhone(String model, String company, int price) {
		
		super (model , company , price );
		// TODO Auto-generated constructor stub
	}

	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
		
	}

	public void pay() {
		System.out.print("애플 페이로 ");
		super.pay();
	}
}



