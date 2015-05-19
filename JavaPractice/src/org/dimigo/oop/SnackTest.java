/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 19.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class SnackTest {
	
	public static void main(String[] args){
		
		Snack[] snackArr;
		int sum = 0;
		snackArr = new Snack[] {
			new Snack("스윙칩", "농심", 1100, 2),
			new Snack("콘칩", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack snack :snackArr) {
			sum += snack.calcPrice();
			snack.printSnack();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d", sum));

		
		
		
		
		
	}
}
