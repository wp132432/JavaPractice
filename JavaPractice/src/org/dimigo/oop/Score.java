/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;
/**
 * <pre>
 * org.dimigo.oop
 * |_ Score
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력=> ");
		int kor =scanner.nextInt();
		System.out.println("수학 점수 입력=> ");
		int math =scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int english =scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<< 점수 출력 >>\n")
		.append("국어 점수: ")
		.append(kor + "점\n")
		.append("수학 점수: ")
		.append(math + "점\n")
		.append("영어 점수: ")
		.append(english +"점\n")
		.append("총첨: ")
		.append((kor+math+english) + "점\n")
		.append("평균: ")
		.append(String.format("%.1f", ((double)kor + math + english) / 3) + "점\n").toString();
		
		System.out.println(sb);
		
		
		
	}

}
