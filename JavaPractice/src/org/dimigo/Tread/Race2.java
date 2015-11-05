/**
 * 
 */
package org.dimigo.Tread;

/**
 * <pre>
 * org.dimigo.Tread
 * |_ Race2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Race2 {
		
		public static void main(String[] args) {
			System.out.println("main thread start");
			Thread t1 = new Thread(new Runner2("정욱재"));
			Thread t2 = new Thread(new Runner2("정종현"));
			
			
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
			
			t1.start();
			t2.start();
			
			System.out.println(" end");
		}

	}


