package org.dimigo.basic;

public class Operator {
	
	public static void main(String[] args) {
		
		int snemoa = 9;
		int snemob = 10;
		double snemoh = 5.8;
		double snemow = ((snemoa + snemob)*snemoh /2 );
		
		
		int pnemoa = 9;
		double pnemoh = 5.4;
		double pnemow = (pnemoa *pnemoh );
		
		System.out.println( "<<사다리꼴의 넓이>>");
		System.out.println( pnemow );
		
		System.out.println("<<평행사변형의 넓이>>" );
		
		System.out.println( snemow );
		
		System.out.println("<<도형 넓이 비교>>");
		if (pnemow > snemow);
		{
		System.out.println( "평행사변형의 넓이가 " + (snemow - pnemow) + " 만큼 더 큽니다.");
		}
		
		
		
		
		
	}

}
