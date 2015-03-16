package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		
		String iuname = "아이유";
		boolean iugender = true;
		int iuage = 23;
		double iutall = 161.8;
		float iuweight = 44.3f;
		char iublood = 'A';
		//수정
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+iuname );
		
		if(iugender) {
			System.out.println("성별 : 여자");
		}else{
			System.out.println("성별 : 남자");
		}
		
		System.out.println("나이 : "+ iuage +" 세");
		System.out.println("키 :"+ iutall + " cm");
		System.out.println("몸무게"+iuweight+ " kg");
		System.out.println("혈액형"+iublood + "형");
		
		
		
		
	}

}
