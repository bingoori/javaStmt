package vector;

import java.util.Vector;

/**
 * @package : vector
 * @file : AddDemo.java
 * @author sdwoo90@gmail.com
 * @date 2016. 3. 15.
 * @story
 */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>(); // String도 객체
		String a = "a", b = "b", c = "c", d = "d";
		
		vc.add(a);
		vc.add(b);
		vc.add(c);
		vc.add(d);
		
		System.out.println(vc);
		String[] strArr = new String[5];
		String sa = "a",sb="b",sc="c",sd="d",se = "e";
		
		strArr[0] = sa;
		strArr[1] = sb;
		strArr[2] = sc;
		strArr[3] = sd;
		
		
		
		

	}

}
