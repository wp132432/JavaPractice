package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String type = "고속버스";
		int money = 0;
		
		

		
		switch (type){
		case "고속버스" : 
			money = 850 + distance/10*300;
			if(distance %10 ==0) {money -= 300;}
		case "경차" :
			money = 300 + distance/10*200;
			if(distance %10 ==0) {money -=200;}
		default :
			type = "그 외";
			money = 300 + distance/10*300;
			if(distance %10 == 0);{money -=200;}
			
		}		
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 :" + distance +"km");
		System.out.println("차종 :" + type );
		System.out.println("요금 :" + money + "원");
		
	}

}
