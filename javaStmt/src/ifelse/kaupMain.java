package ifelse;

import java.util.Scanner;

/**
 *@file : kaupMain.java
 *@author bingoori
 *@date 2016. 3. 10.
 *@story 카우푸 지수를 구하는 코드 -> 은닉화처리
 */
public class kaupMain {

	public static void main(String[] args) {
		kaup k = new kaup();
		//지역변수
		int kaup = 0;
		double height = 0.0, weight = 0.0;
		String result = "", name = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 키, 몸무게 입력");
		
		
		k.setName(sc.next());
		k.setHeight(sc.nextInt());
		k.setWeight(sc.nextInt());
		k.setResult();
		result = k.getResult();//파라미터 값 height,weight
		System.out.println(result);
	}

	

}



