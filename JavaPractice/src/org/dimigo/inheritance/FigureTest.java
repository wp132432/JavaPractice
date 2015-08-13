/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * |_ FigureTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 13.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(20, 20,5,8);
		Triangle t = new Triangle(0, 0, 5, 8);
		
		System.out.println("원돌이의 넓이 :" + String.format("%.1f",c.calcArea()));
		System.out.println("탱글이의 넓이 :" + r.calcArea());
		System.out.println("삼각이의 넓이 :" + t.calcArea());
		
		
		System.out.println();
		
		c.printCenter();
		r.printCenter();
		t.printCenter();
		
		c.moveFigure(5, 5);
		r.moveFigure(15, 15);
		t.moveFigure(25, 25);
		
		
		System.out.println();
		c.printCenter();
		r.printCenter();
		t.printCenter();
		
	}

}
