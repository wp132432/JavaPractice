/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * |_ Movie
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Movie {
	
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the limitAge
	 */
	public int getLimitAge() {
		return limitAge;
	}
	

}
