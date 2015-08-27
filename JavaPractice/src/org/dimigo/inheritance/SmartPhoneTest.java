/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SmartPhone[] phones = {
				new IPhone("iPhone6", "apple", 700000),
				new Galaxy("GalaxyS6", "삼성", 650000)
			};
			
			for(int i=0 ; i<2 ; i++) {
				System.out.println(phones[i].toString());
				phones[i].turnOn();
				phones[i].pay();
				phones[i].useSpecialFunction();
				phones[i].turnOff();
				System.out.println();
			}

		
		
		
		
		
		
		
		
		
	}

}
