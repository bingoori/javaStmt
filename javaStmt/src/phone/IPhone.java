package phone;



/**
 *@package : phone
 *@file : IPhone.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 16.
 *@story
 */
public class IPhone extends CellPhone {
	private String data;

	public static String BRAND = "아이폰"; //브랜드명은 안바뀐다.
	
	public static boolean TRUE = true;
	//아이폰은 집접화기는 생산하지 않는다

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setData(String data,String name) {
	
		this.data = data;
		
	}
}
