/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * |_ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember brother = new FamilyMember("남동생");
		FamilyMember me = new FamilyMember("나");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(mother, 10000);
		PiggyBank.putMoney(father, 5000);
		PiggyBank.putMoney(brother, 1000);
		PiggyBank.putMoney(me, 2000);
		
		PiggyBank.printBalance();
		

	}

}
