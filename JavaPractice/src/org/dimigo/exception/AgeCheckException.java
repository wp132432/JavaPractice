/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * |_ AgeCheckException
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class AgeCheckException extends Exception {
	
	public AgeCheckException(Movie age) {
		super(age.getTitle() + "은/는" + age.getLimitAge() + "세 이상 관람가입니다. ");
	}
}
