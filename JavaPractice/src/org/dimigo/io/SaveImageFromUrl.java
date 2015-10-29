/**
 * 
 */
package org.dimigo.io;



import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
/**
 * <pre>
 * org.dimigo.io
 * |_ SaveImageFromUrl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 29.
 * </pre>
 * @author : 정종현
 * @version : 1.0
 */
public class SaveImageFromUrl {
	public static void main(String[] args) {
		String img_url = "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcToZGEWvIBFgCiona6d74FtVthl4lkdJg3d61SGy-UCf4qFuDLD";
		
		try {
			URL url = new URL(img_url);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/구글.jpg");
			
			int result;
			
			
			
			// 1바이트씩 읽어오기
			while((result = is.read()) != -1) { 
				os.write(result);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}