/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Question {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("학교에서 가르침을 받는사람은?");
		String answer = scanner.nextLine();
		if("학생".equals(answer)){
			System.out.println("정답입니다");
		}else{
			System.out.println("틀렸습니다");
		}
		
		System.out.println("학교에서 가르치는 사람은?");
		String answer2 = scanner.nextLine();
		if("선생님".equals(answer2)){
			System.out.println("정답입니다");
		}else{
			System.out.println("틀렸습니다");
		}
		
		System.out.println("학교에서 가장높은선생님은?");
		String answer3 = scanner.nextLine();
		if("사무국장".equals(answer3)){
			System.out.println("정답입니다");
		}else{
			System.out.println("틀렸습니다");
		}
	}
}
