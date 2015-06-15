/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ PiggyBank
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member, int amount){
		balance+=amount;
		System.out.println(member.getMemberName()+ amount + "원 넣음");
	}
	public static void printBalance(){
		System.out.println(balance);
	}
	
}
