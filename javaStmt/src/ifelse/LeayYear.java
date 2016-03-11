package ifelse;

import java.util.Scanner;

/**
 *@package : ifelse
 *@file : LeayYear.java
 *@author sdwoo90@gmail.com
 *@date 2016. 3. 11.
 *@story 윤년 프로그램
 *연도를 4로 나눈값이 0이라면 윤년일 수 있다.
 *그러나 해당 년도가 100으로 나눠 떨어지면 평년
 *평년이라해도 400으로 나누어 떨어지면 윤년
 *
 *예를 들면 1000년은 평년, 2000년은 윤년, 2016년은 윤년 입니다.
 *2016년은 윤년입니다.  2016을 입력 했을때 윤년이라 나오면 테스트 완료
 *
 *객체로 연결도 해본다. 년 월 다입력받는다.
 */

public class LeayYear {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("판별하려는 년도를 입력");
	int year = scanner.nextInt();
	String yearStr = "";
	if(year%100 == 0){ //100으로 나눠 떨어진다.
		yearStr = "윤년";
	}else{
		yearStr = "평년";
	}
	System.out.println(year + "는 "+ yearStr + "입니다.");
}
}
