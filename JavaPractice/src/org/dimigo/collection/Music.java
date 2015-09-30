/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * |_ Music
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class Music {
	
	private String title;
	private String singer;
	/**
	 * @param title
	 * @param singer
	 */
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	public void setTitle(){}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	} 
	
	@Override
    public String toString() {
        return "Music [title= " + title + ", singer= " + singer + "]";
    }
	

}
	
